package com.Practice.Ch7.Day4.ATM;

public class VIPUser extends UserData {
	int VIPLevel;  //��ǰvip�ȼ�
	
	//�����滻ԭ��
	public void setMoney(double money) {
		if (money < -VIPLevel * 10000) {
			System.out.println("��Ķ�Ȳ���");
		} else {
			this.money = money;
		}
	}
}