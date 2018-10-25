package com.Practice.Ch7.Day4.ATM;

public class UserData {
	
	String acc;			/*账号*/
	String pass;		/*密码*/
	double money;		/*金额*/
	
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
			//自定义Exception
			System.out.println("金额异常");//此处不处理，java中这种异常，采取的是抛出到上级
		} else {
			this.money = money;
		}
	}
	
}
