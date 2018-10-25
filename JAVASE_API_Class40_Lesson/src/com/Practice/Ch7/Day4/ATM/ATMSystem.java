package com.Practice.Ch7.Day4.ATM;

public class ATMSystem implements BackDelegate {
	Tools tool = new Tools();
	UserAction logUser;
	/*
	 * 1. 准备工作（数据、工具、UI） 
	 * a. 数据包括：用户对象数组、对象个数、登录用户下标 
	 * b. 工具包括：输入工具、输出工具、查找工具 
	 * c. UI包括：界面UI、用户选项？？ UI、UE、UX
	 */
	void start() {
		DataCenter.initData(); 	// 准备数据
		enterSystem();			// 第一次进入系统	
	}
	
	void enterSystem() {
		/*
		 * 2. 开始让工程启动起来 
		 * a. UI展示 
		 * b. 数据呈现
		 */
		UI.firstUI(); // 展示UI
		/*
		 * 3. 开始选项操作
		 */
		String optionStr = tool.input(2);
		//怎么把string变为整数？？
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
	
	/*登录*/
	void loginAction() {
		//输入账号
		String acc = tool.input(0);
		//输入密码
		String pass = tool.input(1);
		
		//登录验证
		int index = tool.findUser(acc);
		if (tool.findUser(acc) != -1) {//查找用户，如果找到了，必然是0-19
			if (pass.equals(DataCenter.allUser[index].getPass())) {
				tool.output(0);
				//1. 保留登录用户
				DataCenter.logIndex = index;
				//2. 让登录用户开始进行2级操作，展示2级菜单
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
	
	/*注册*/
	void registerAction() {
		//输入账号
		String acc = tool.input(0);
		//输入密码
		String pass = tool.input(1);
		
		if (tool.findUser(acc) != -1) {//查找用户，如果找到了，必然是0-19
			tool.output(3);
		} else {
			//注册成功
			tool.output(4);
			
			UserData newUser = new UserData();
			newUser.setAcc(acc);
			newUser.setPass(pass);
			
			//目前有userCount个人，那么新用户的下标就是userCount
			DataCenter.allUser[DataCenter.userCount] = newUser; 
			DataCenter.userCount ++;//注册用户数量加1
			
			this.enterSystem();//这样用有什么问题？
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
		System.out.println("建立代理");
	}
	
	@Override
	public void back() {
		//只要back方法被调用，那么enterSystem一定会触发，此时就会回到主菜单
		this.enterSystem();
	}

}

