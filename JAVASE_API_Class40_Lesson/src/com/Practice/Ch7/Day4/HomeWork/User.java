package com.Practice.Ch7.Day4.HomeWork;

public class User {
	String account;
	String pass;
	Double money;
	
	
	
	 void checkMoney(){
		 System.out.println(money);
	 }
	 
	 void transMoney(User other,Double money) throws Exception{
		 if(this.money < money){
			 throw new MyProjectException(101);
		 }else {
			this.money -= money;
			other.money += money;
		}
	 }
	 
	 void logout(){
		 System.out.println("×¢Ïú");
	 }
}
