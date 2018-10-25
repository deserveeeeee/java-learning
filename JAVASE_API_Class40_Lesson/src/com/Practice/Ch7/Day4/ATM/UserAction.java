package com.Practice.Ch7.Day4.ATM;

public class UserAction {
	
	Tools tool = new Tools();
	//我的属性的生命周期比我长
	BackDelegate delegate;//代理
	
	//登录之后用户接下来的二级操作
	void nextStep() {
		UI.secondUI();//先展示菜单
		/*
		 * 开始用户的选项操作
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
	
	//查询余额操作
	void showMoney() {
		//当前用户是谁？
		//如果logIndex没有值？
		//-1在数组下表中，会被当做很大的正整数
		UserData loginUser = DataCenter.allUser[DataCenter.logIndex];
		System.out.println("您当前的余额为："+loginUser.money);
	}
	
	//修改密码操作
	void changePass() {
		
	}
	
	//存取款操作
	void setMoney() {
		int option = Integer.parseInt(tool.input(3));
		double money = Double.parseDouble(tool.input(4));
		UserData loginUser = DataCenter.allUser[DataCenter.logIndex];
		
		if (option == 1) {//存钱
			loginUser.setMoney(loginUser.getMoney()+money);
		} else if (option == 2) {//取钱
			//这里不再多做判断，金额为负的情况
			loginUser.setMoney(loginUser.getMoney()-money);
		} else {
			System.out.println("输入错误");
		}
	}
	
	//转账操作
	void transMoney() {
		
	}
	
	//注销操作
	void logout() {
		//new ATMSystem().enterSystem();//只有当数据与操作对象完全分离时，才能这样做
		delegate.back();
		
		//如果要回到主菜单，旧的信息怎么保留？因为是静态数据，所以数据不受影响
		//new一个ATMSystem？可不可以
		//怎么找到上级的ATMSystem这个对象？？
		//类与类之间，对象与对象之间的联系
	}
	
	//接口隔离：
	//1. 不让两个类互相引用
	//2. 让功能较多的类只与接口关联，不与另一个类过多的交叉
	//3. 当我们再次增加新的类与这个类联系时，不需要重新构建代码，只需要按照接口的要求实现即可
	
}
