package com.Practice.Ch7.Day4.Class;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//��������
//		����һ������ֱ��ʹ��object��������
		Object obj = 3;  //�Զ�ʶ�𵽺󷽵�����ΪInteger��
		Integer a = (Integer)obj; //������ת��Ϊ����
		int b = (int)obj;  // �������͵�ǿ��ת��
//		��������д��	
//		int b = (Integer)obj;


		Object obj1 = 3.0;
		Double c = (Double)obj1;
		double cValue = c;
		Integer d = (int)cValue;
		
		
		Person p1 = new Person();
		
		
		
//		Class�����Կ���������ʵ������
		p1.getClass();
//		person�����
		Class<Person> e = Person.class;
		Field [] fields = e.getDeclaredFields();   //��ȡ��������
		System.out.println(Arrays.toString(fields));
		try {
			Person per3 = e.newInstance(); //	��ͬ����
			Person per4 = new Person();//	��ͬ����
//			����÷���ķ�ʽ����������Խ��и�ֵ�����޸�
			Field f1 = fields[0];
			Object name = f1.get(per3);  
//			name.getClass();
			//ȡ����Ӧ�����ָ�����ԣ��� String name = per3.name;
			f1.set(per3, "Molly"); // �����ö�Ӧ���������Ϊ���� per3.name = "Molly"
			
			Method [] methods = e.getMethods();
			System.out.println(Arrays.toString(methods));
			try {
				methods[0].invoke(per3,per4);
			} catch (IllegalArgumentException | InvocationTargetException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
//		ʵ�ʵ��࣬��ȡclass����ʵ��ȡ��һ��class�����Ķ���
//		Object f = Person.class;
		
		
//		����ⷴ�䣬�������ǿ��Լ�����һ��x�������䵽����ڲ���
//		�Ϳ������ⲿͨ����������������Ժͷ����б�
		
	}	

}
