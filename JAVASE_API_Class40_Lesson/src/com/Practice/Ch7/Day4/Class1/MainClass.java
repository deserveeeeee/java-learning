package com.Practice.Ch7.Day4.Class1;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��������
		Object xObject = 3.4;
		Double xDouble = (Double)xObject;
		System.out.println(xObject);
		double xDoubleValue = xDouble;
		Integer xInteger = (int)xDoubleValue;
		System.out.println(xInteger);
//		�Ը������Ե���д
//		��Person class
//      ����
		Class<Person> pClass = Person.class;
		Person p1;
		try {
			p1 = pClass.newInstance();
//			����֮����
			Field [] fields = pClass.getDeclaredFields();
			fields[0].set(p1, "Molly");
			fields[1].set(p1, "20180101"); // �������������õ�����ֵ��������object���͵ġ�
			System.out.println(fields[0].get(p1));
			System.out.println(fields[1].get(p1));
			
//			����֮����
			Method [] methods = pClass.getDeclaredMethods();
			methods[0].invoke(p1);    // ���������Ǵ���Ĳ�����������object���͵ġ�
			methods[2].invoke(p1);
//			System.out.println(Arrays.toString(methods));
//			methods[1].invoke(p1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

    }
}
