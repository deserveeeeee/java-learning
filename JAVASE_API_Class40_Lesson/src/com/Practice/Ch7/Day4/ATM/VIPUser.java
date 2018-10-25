package com.Practice.Ch7.Day4.ATM;

public class VIPUser extends UserData {
	int VIPLevel;  //当前vip等级
	
	//里氏替换原则
	public void setMoney(double money) {
		if (money < -VIPLevel * 10000) {
			System.out.println("你的额度不足");
		} else {
			this.money = money;
		}
	}
}