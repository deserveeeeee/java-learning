package com.Practice.Ch7.Day4.ATM;

public class UserData {
	
	String acc;			/*�˺�*/
	String pass;		/*����*/
	double money;		/*���*/
	
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		if (money < 0) {
			//�Զ���Exception
			System.out.println("����쳣");//�˴�������java�������쳣����ȡ�����׳����ϼ�
		} else {
			this.money = money;
		}
	}
	
}
