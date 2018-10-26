package com.Practice.Ch7.Day5.Class;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DataCenter {

	/* 用户对象数组 */
	static ArrayList<UserData> alluser = new ArrayList<UserData>();
	static UserData logUser; // 当前登录的用户对象
	static Properties myProperties = new Properties();  //一个properties配置文件最好就设置为一个，比如设置成为static静态的。
	static String usersInfoPath = "src\\com\\Practice\\Ch7\\Day5\\Class\\UsersInfo.properties";
//  所有用户信息的地址
	static String usersBillsPath = "src\\com\\Practice\\Ch7\\Day5\\Class\\UsersBiils.properties";
//	所有用户流水的地址
	
	static void systemUsers(){
		// 系统默认的三个账号
				UserData user0 = new UserData();
				user0.setAcc("admin");
				user0.setPass("123456");
				try {
					user0.setMoney(100000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				user0.setId(0);
				alluser.add(user0);

				UserData user1 = new UserData();
				user1.setAcc("boss");
				user1.setPass("1111");
				try {
					user1.setMoney(10000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				user1.setId(1);
				alluser.add(user1);

				UserData user2 = new UserData();
				user2.setAcc("me");
				user2.setPass( "asdf");
				try {
					user2.setMoney(50000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				user2.setId(2);
				alluser.add(user2);
				
	}
	
	// 系统默认的三个账号：程序第一次运行的时候可以设置一下，后面程序运行则不需要了
	static void initData() {
		
		 //从usersInfo file中加载信息
		
		try {
			myProperties.load(new FileReader(usersInfoPath)); 
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		if (myProperties.keySet().size() == 0) {
			systemUsers();   //设置好系统的默认三个账号以后
			uploadData();    //再把这些账号上传到file中去
		}else {
			downloadData(myProperties);  //如果不为空，则不再是系统第一次运行了。这个时候就把
		}
		
	}
	
//	把的ArrayList<UserData> alluser的最新数据，取出到properties，再存入file中
	static void uploadData() {
		for (int i = 0; i < alluser.size(); i++) {
			try {
				myProperties.load(new FileReader(usersInfoPath));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			myProperties.setProperty("acc" + i, alluser.get(i).getAcc());
			myProperties.setProperty("pass" + i, alluser.get(i).getPass());
			myProperties.setProperty("money" + i,alluser.get(i).getMoney()+"");
			myProperties.setProperty("id" + i, i+"");
		}
		try {
			myProperties.store(new FileWriter(usersInfoPath), "");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	账户数据file中取出到properties中，再到ArrayList<UserData> alluser中
	static void downloadData(Properties myProperties) {
		for(int i = 0 ;;i++){
			if (! myProperties.containsKey("id" + i)) {
				break;
			}
			
			UserData user = new UserData();
			user.setAcc(myProperties.getProperty("acc" + i));
			user.setPass(myProperties.getProperty("pass" + i));
			try {
				user.setMoney(Double.parseDouble(myProperties.getProperty("money" + i)));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			user.setId(i);
		}
	}
	
}
