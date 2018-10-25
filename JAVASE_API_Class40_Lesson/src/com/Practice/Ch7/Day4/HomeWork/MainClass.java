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
//		��ҵA��
//		1. ��һ��User�࣬ӵ���˺š����롢����������ԣ�ӵ�в�ѯ��ת�ˡ�ע������������������������
//		ͨ��Class��Ĳ���������һ��User����
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
		
//		2. ͨ��Field��Method�������������User�����Ժͷ����б�
		Field [] fields = uClass.getDeclaredFields();
		Method [] methods = uClass.getDeclaredMethods();
		System.out.println(Arrays.toString(fields));
		System.out.println(Arrays.toString(methods));
		/*for (Method method : methods) {  
			System.out.println(method);
		}*/
				
//		3. ͨ��Field���θ������ÿ�����Ը�ֵ��
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
		
		
		
		
		
//		4. ͨ��Method���ε��ö����ÿ��������
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
		
		
		
//		5. ��һ��User�������Ϣ������Properties�ļ���
//		properties��Ϊ�������½������롢�����ļ�
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
//		��ҵB��
//		�ع���ţATM��Ŀ����������ͨ���飬���ɼ��϶���List��Map����
//		�ع�ATM��Ŀ��ʹ�ó���������û�ע����˺��ܹ����������´ο��ٴε�¼��
//		�������в�������ˮ��Ϣ��������ʱ��ѯ��
//
//		Ԥϰ��
//		�߳�Thread��Runnable�ӿ�
//		�˽�ʲô�����̡߳����̡߳��߳�ͬ�����߳��첽���̵߳ȴ����̲߳������߳�����
	
	}
}
