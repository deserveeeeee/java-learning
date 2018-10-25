package com.Practice.Ch7.Day4.ATM;

public class ATMSystem implements BackDelegate {
	Tools tool = new Tools();
	UserAction logUser;
	/*
	 * 1. ׼�����������ݡ����ߡ�UI�� 
	 * a. ���ݰ������û��������顢�����������¼�û��±� 
	 * b. ���߰��������빤�ߡ�������ߡ����ҹ��� 
	 * c. UI����������UI���û�ѡ��� UI��UE��UX
	 */
	void start() {
		DataCenter.initData(); 	// ׼������
		enterSystem();			// ��һ�ν���ϵͳ	
	}
	
	void enterSystem() {
		/*
		 * 2. ��ʼ�ù����������� 
		 * a. UIչʾ 
		 * b. ���ݳ���
		 */
		UI.firstUI(); // չʾUI
		/*
		 * 3. ��ʼѡ�����
		 */
		String optionStr = tool.input(2);
		//��ô��string��Ϊ��������
		int option = Integer.parseInt(optionStr);
		switch (option) {
		case 1:
			this.loginAction();
			break;
		case 2:
			this.registerAction();
			break;
		case 3:
			this.exitAction();
			break;
		default:
			break;
		}
	}
	
	/*��¼*/
	void loginAction() {
		//�����˺�
		String acc = tool.input(0);
		//��������
		String pass = tool.input(1);
		
		//��¼��֤
		int index = tool.findUser(acc);
		if (tool.findUser(acc) != -1) {//�����û�������ҵ��ˣ���Ȼ��0-19
			if (pass.equals(DataCenter.allUser[index].getPass())) {
				tool.output(0);
				//1. ������¼�û�
				DataCenter.logIndex = index;
				//2. �õ�¼�û���ʼ����2��������չʾ2���˵�
				logUser = new UserAction();
				logUser.delegate = this;
				logUser.nextStep();
			} else {
				tool.output(1);
			}
		} else {
			tool.output(2);
		}
	}
	
	/*ע��*/
	void registerAction() {
		//�����˺�
		String acc = tool.input(0);
		//��������
		String pass = tool.input(1);
		
		if (tool.findUser(acc) != -1) {//�����û�������ҵ��ˣ���Ȼ��0-19
			tool.output(3);
		} else {
			//ע��ɹ�
			tool.output(4);
			
			UserData newUser = new UserData();
			newUser.setAcc(acc);
			newUser.setPass(pass);
			
			//Ŀǰ��userCount���ˣ���ô���û����±����userCount
			DataCenter.allUser[DataCenter.userCount] = newUser; 
			DataCenter.userCount ++;//ע���û�������1
			
			this.enterSystem();//��������ʲô���⣿
		}
	}
	
	void exitAction() {
		System.exit(0);
	}

	public static void main(String[] args) {
		new ATMSystem().start();
	}

	@Override
	public void setDelegate() {
		System.out.println("��������");
	}
	
	@Override
	public void back() {
		//ֻҪback���������ã���ôenterSystemһ���ᴥ������ʱ�ͻ�ص����˵�
		this.enterSystem();
	}

}

