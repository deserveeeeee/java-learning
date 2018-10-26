package com.Practice.Ch7.Day5.Class;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DataCenter {

	/* �û��������� */
	static ArrayList<UserData> alluser = new ArrayList<UserData>();
	static UserData logUser; // ��ǰ��¼���û�����
	static Properties myProperties = new Properties();  //һ��properties�����ļ���þ�����Ϊһ�����������ó�Ϊstatic��̬�ġ�
	static String usersInfoPath = "src\\com\\Practice\\Ch7\\Day5\\Class\\UsersInfo.properties";
//  �����û���Ϣ�ĵ�ַ
	static String usersBillsPath = "src\\com\\Practice\\Ch7\\Day5\\Class\\UsersBiils.properties";
//	�����û���ˮ�ĵ�ַ
	
	static void systemUsers(){
		// ϵͳĬ�ϵ������˺�
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
	
	// ϵͳĬ�ϵ������˺ţ������һ�����е�ʱ���������һ�£����������������Ҫ��
	static void initData() {
		
		 //��usersInfo file�м�����Ϣ
		
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
			systemUsers();   //���ú�ϵͳ��Ĭ�������˺��Ժ�
			uploadData();    //�ٰ���Щ�˺��ϴ���file��ȥ
		}else {
			downloadData(myProperties);  //�����Ϊ�գ�������ϵͳ��һ�������ˡ����ʱ��Ͱ�
		}
		
	}
	
//	�ѵ�ArrayList<UserData> alluser���������ݣ�ȡ����properties���ٴ���file��
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
	
//	�˻�����file��ȡ����properties�У��ٵ�ArrayList<UserData> alluser��
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
