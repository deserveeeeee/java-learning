package com.Practice.Ch7.Day4.HomeWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		作业A：
//		1. 建一个User类，拥有账号、密码、金额三个属性，拥有查询余额、转账、注销三个方法（用输出替代）。
//		通过Class类的操作，创建一个User对象。
		Class<User> uClass = User.class;
		try {
			User user = uClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		2. 通过Field和Method方法，遍历输出User的属性和方法列表。
		Field [] fields = uClass.getDeclaredFields();
		Method [] methods = uClass.getDeclaredMethods();
		System.out.println(Arrays.toString(fields));
		System.out.println(Arrays.toString(methods));
		/*for (Method method : methods) {  
			System.out.println(method);
		}*/
				
//		3. 通过Field依次给对象的每个属性赋值。
		try {
			User user = uClass.newInstance();
			fields[0].set(user, "123");
			fields[1].set(user, "wefr");
			fields[2].set(user, 12.31);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
//		4. 通过Method依次调用对象的每个方法。
		try {
			User user1 = uClass.newInstance();
			User user2 = uClass.newInstance();
			try {
				methods[0].invoke(user1);
				methods[1].invoke(user1, user2,100);
				methods[2].invoke(user1);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		5. 将一个User对象的信息，存入Properties文件。
//		properties分为三步：新建、存入、放入文件
		Properties myProperties = new Properties();
		try {
			User user = uClass.newInstance();
			myProperties.setProperty("account",fields[0].get(user).toString());
			myProperties.setProperty("pass",fields[1].get(user).toString());
			myProperties.setProperty("money",fields[2].get(user).toString());
			String path = "src\\com\\Practice\\Ch7\\Day4\\HomeWork\\UserInfo";
			try {
				myProperties.load(new FileReader(path));
				myProperties.store(new FileWriter(path), "userInfo");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//
//		作业B：
//		重构蜗牛ATM项目，将所有普通数组，换成集合对象（List、Map）。
//		重构ATM项目，使得程序结束后，用户注册的账号能够被保留，下次可再次登录。
//		增加所有操作的流水信息，并可随时查询。
//
//		预习：
//		线程Thread、Runnable接口
//		了解什么是主线程、子线程、线程同步、线程异步、线程等待、线程并发、线程锁。
	
	}
}
