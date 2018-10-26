package com.Practice.Ch7.Day4.ATM;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DataCenter {
	
	/*用户对象数组*/
	static Map<String, UserData> allUser = new HashMap<String, UserData>();
	static String logAcc;
	static void initData(){
		File users = new File("src\\com\\Practice\\Ch7\\Day4\\ATM\\UserInfo");
		File [] files = users.listFiles();
		for (File file : files) {
				Properties mProperties = new Properties();
				try {
					mProperties.load(new FileReader("src\\com\\Practice\\Ch7\\Day4\\ATM\\UserInfo\\"+file.getName()));
					UserData userData = new UserData();
					userData.setAcc(mProperties.getProperty("acc"));
					userData.setPass(mProperties.getProperty("pass"));
					try {
						userData.setMoney(Double.valueOf(mProperties.getProperty("money")));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					allUser.put(userData.getAcc(), userData);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	static void addUser(String acc,String pass,Double money){
		UserData user = new UserData();
		user.setAcc(acc);
		user.setPass(pass);
		try {
			user.setMoney(money);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		allUser.put(acc, user);
		
		Properties mProperties = new Properties();
		mProperties.setProperty("acc", acc);
		mProperties.setProperty("pass", pass);
		mProperties.setProperty("money", money.toString());
		String path = "src\\com\\Practice\\Ch7\\Day4\\ATM\\UserInfo\\" + acc + ".properties";
		try {
			mProperties.load(new FileReader(path));
			mProperties.store(new FileWriter(path), "userInfo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	/*对象个数*/
//	static int userCount = 0;
//	/*登录用户下标*/
//	static int logIndex = -1; 
//	
//	static void initData() {
//		// 初始化所有默认的账户信息
//		
//		UserData user1 = new UserData();
//		user1.acc = "admin";
//		user1.pass = "123456";
//		user1.money = 1000000;
//		
//		VIPUser user2 = new VIPUser();
//		user2.VIPLevel = 4;
//		user2.acc = "boss";
//		user2.pass = "1111";
//		user2.money = 10000;
//		
//		
//		UserData user3 = new UserData();
//		user3.acc = "me";
//		user3.pass = "asdf";
//		user3.money = 50000;
//		
//		allUser[0] = user1;
//		allUser[1] = user2;
//		allUser[2] = user3;
//		userCount = 3;//用户数量
//	}
	
	

}
