package com.Practice.Ch7.Day5.Class;

import com.Practice.Ch7.Day4.ATM.MyProjectException;

public class UserData {
	
	private String acc;			/*�˺�*/
	private String pass;		/*����*/
	private double money;		/*���*/
	private int id;            	/*����û��Ķ���id*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public void setMoney(double money) throws Exception {
		if (money < 0) {
			//�Զ���Exception
			throw new MyProjectException(102);
		} else {
			this.money = money;
		}
	}
	
}
