package com.Practice.Ch7.Day4.Class1;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		封包、拆包
		Object xObject = 3.4;
		Double xDouble = (Double)xObject;
		System.out.println(xObject);
		double xDoubleValue = xDouble;
		Integer xInteger = (int)xDoubleValue;
		System.out.println(xInteger);
//		对父类属性的重写
//		见Person class
//      反射
		Class<Person> pClass = Person.class;
		Person p1;
		try {
			p1 = pClass.newInstance();
//			反射之属性
			Field [] fields = pClass.getDeclaredFields();
			fields[0].set(p1, "Molly");
			fields[1].set(p1, "20180101"); // 后面的这个是设置的属性值，但是是object类型的。
			System.out.println(fields[0].get(p1));
			System.out.println(fields[1].get(p1));
			
//			反射之方法
			Method [] methods = pClass.getDeclaredMethods();
			methods[0].invoke(p1);    // 后面的这个是传入的参数，但是是object类型的。
			methods[2].invoke(p1);
//			System.out.println(Arrays.toString(methods));
//			methods[1].invoke(p1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

    }
}
