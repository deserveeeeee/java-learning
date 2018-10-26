package com.Practice.Ch7.Day4.ATM;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Date;

public class Bills {
//	存取款流水
	public void setMoney (UserData user,Double money,int option){
//		option 为 1 代表存钱
//		option 为2 代表取钱
		String path = "src\\com\\Practice\\Ch7\\Day4\\ATM\\UserInfo\\" + user.getAcc() + "Bills.properties";
		
		Properties mProperties = new Properties();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		Date date = new Date();// new Date()为获取当前系统时间
		
		
		if(option == 1){
			mProperties.setProperty(df.format(new Date()),
					df.format(new Date() + "您成功存款"+ money +"元\r\n" +
					"您原先余额为:" + user.getMoney() +"\r\n" 
					+"您现在的余额为:" + (user.getMoney()+money)));
		}else if(option == 2) {
			df.format(new Date() + "您成功取款！" + money +"元\r\n" +
					"您原先余额为:" + user.getMoney() +"\r\n" 
					+"您现在的余额为:" + (user.getMoney()-money));
		}
		
		
		try {
			mProperties.load(new FileReader(path));
			mProperties.store(new FileWriter(path), "userBills");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

//	转账流水
//	public void transMoney (UserData user,Double money,Us)
}


