package com.Practice.Ch7.Day4.ATM;

public class UserData {
	
	private String acc;			/*账号*/
	private String pass;		/*密码*/
	private double money;		/*金额*/
	
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
			//自定义Exception
			throw new MyProjectException(102);
		} else {
			this.money = money;
		}
	}
	
}
