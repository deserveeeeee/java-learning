package com.Practice.Ch7.Day2.Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeMap;

public class PhoneBook {
//	/*����һ������ϵ�˵����ݵ��ɶ���������*/
//	Map<String, Users> contacts = new TreeMap<String,Users>();
//	void create1(String [] x){
//		contacts.put(x[0].substring(0,1).toUpperCase(), new Users(x[0], x[1], x[2]));
//	}
//	
//	/*������������ϵ�˵����ݵ���һ������������*/
//	Map<String, String []> contacts2 = new TreeMap<String,String []>();
//	void create2(String [] x){
//		contacts2.put(x[0].substring(0,1).toUpperCase(), x);
//	}
//	
//	/*������������ϵ�˵����ݵ���һ��map������*/
//	Map<String, Map<String,String []>> contacts3 = new TreeMap<String,Map<String,String []>>();
//	void create3(String [] x){
//		Map<String, String []> users = new TreeMap<String,String []>();
//		users.put(x[0], x);
//		contacts3.put(x[0].substring(0,1).toUpperCase(), users);
////		���дΪ
////		contacts3.put(x[0].substring(0,1).toUpperCase(), 
////				new TreeMap<String,String []>().put(x[0], x));	
//	}
	Map<Character, ArrayList<Users>> contacts = new HashMap<Character, ArrayList<Users>>();
	
	/*����һ������*/
	void book (){
		for (char i = 'A'; i <= 'Z'; i++) {
			this.contacts.put(i, new ArrayList<Users>());
		}
	}
	
	/*�ٰ��û��ǵ����ݷŽ��������*/
	void input (Users users){
		this.contacts.get(users.name.substring(0,1).toUpperCase().charAt(0)).add(users);
	}
	
}
