package com.Practice.Ch7.Day4.ATM;

public class DataCenter {
	
	/*�û���������*/
	
	static UserData [] allUser = new UserData[20];
	/*�������*/
	static int userCount = 0;
	/*��¼�û��±�*/
	static int logIndex = -1; 
	
	static void initData() {
		// ��ʼ������Ĭ�ϵ��˻���Ϣ
		
		UserData user1 = new UserData();
		user1.acc = "admin";
		user1.pass = "123456";
		user1.money = 1000000;
		
		VIPUser user2 = new VIPUser();
		user2.VIPLevel = 4;
		user2.acc = "boss";
		user2.pass = "1111";
		user2.money = 10000;
		
		
		UserData user3 = new UserData();
		user3.acc = "me";
		user3.pass = "asdf";
		user3.money = 50000;
		
		allUser[0] = user1;
		allUser[1] = user2;
		allUser[2] = user3;
		userCount = 3;//�û�����
	}
	
	

}
