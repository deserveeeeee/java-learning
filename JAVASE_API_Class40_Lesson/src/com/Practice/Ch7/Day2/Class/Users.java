package com.Practice.Ch7.Day2.Class;

import java.util.HashMap;
import java.util.Map;

public class Users {
	String name;
	String phone;
	String address;
	
//	public Users(String name,String phone,String address){
//		this.name = name;
//		this.phone = phone;
//		this.address = address;
//	}
	
	Map<String, String> getUserInfo(){
		Map<String, String> userInfo = new HashMap<String, String>();
		userInfo.put("name", this.name);
		userInfo.put("phone", this.phone);
		userInfo.put("address", this.address);
		return  userInfo;
	}
	
}
