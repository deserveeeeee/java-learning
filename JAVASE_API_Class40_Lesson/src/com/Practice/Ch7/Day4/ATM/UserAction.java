package com.Practice.Ch7.Day4.ATM;

public class UserAction {
	
	Tools tool = new Tools();
	//�ҵ����Ե��������ڱ��ҳ�
	BackDelegate delegate;//����
	
	//��¼֮���û��������Ķ�������
	void nextStep() {
		UI.secondUI();//��չʾ�˵�
		/*
		 * ��ʼ�û���ѡ�����
		 */
		String optionStr = tool.input(2);
		int option = Integer.parseInt(optionStr);
		switch (option) {
		case 1:
			this.showMoney();
			break;
		case 2:
			this.changePass();
			break;
		case 3:
			this.setMoney();
			break;
		case 4:
			this.transMoney();
			break;
		case 5:
			this.logout();
			break;
		default:
			break;
		}
		this.nextStep();
	}
	
	//��ѯ������
	void showMoney() {
		//��ǰ�û���˭��
		//���logIndexû��ֵ��
		//-1�������±��У��ᱻ�����ܴ��������
		UserData loginUser = DataCenter.allUser[DataCenter.logIndex];
		System.out.println("����ǰ�����Ϊ��"+loginUser.money);
	}
	
	//�޸��������
	void changePass() {
		
	}
	
	//��ȡ�����
	void setMoney() {
		int option = Integer.parseInt(tool.input(3));
		double money = Double.parseDouble(tool.input(4));
		UserData loginUser = DataCenter.allUser[DataCenter.logIndex];
		
		if (option == 1) {//��Ǯ
			loginUser.setMoney(loginUser.getMoney()+money);
		} else if (option == 2) {//ȡǮ
			//���ﲻ�ٶ����жϣ����Ϊ�������
			loginUser.setMoney(loginUser.getMoney()-money);
		} else {
			System.out.println("�������");
		}
	}
	
	//ת�˲���
	void transMoney() {
		
	}
	
	//ע������
	void logout() {
		//new ATMSystem().enterSystem();//ֻ�е����������������ȫ����ʱ������������
		delegate.back();
		
		//���Ҫ�ص����˵����ɵ���Ϣ��ô��������Ϊ�Ǿ�̬���ݣ��������ݲ���Ӱ��
		//newһ��ATMSystem���ɲ�����
		//��ô�ҵ��ϼ���ATMSystem������󣿣�
		//������֮�䣬���������֮�����ϵ
	}
	
	//�ӿڸ��룺
	//1. ���������໥������
	//2. �ù��ܽ϶����ֻ��ӿڹ�����������һ�������Ľ���
	//3. �������ٴ������µ������������ϵʱ������Ҫ���¹������룬ֻ��Ҫ���սӿڵ�Ҫ��ʵ�ּ���
	
}
