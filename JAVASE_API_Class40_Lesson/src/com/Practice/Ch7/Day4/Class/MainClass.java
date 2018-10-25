package com.Practice.Ch7.Day4.Class;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//封包、拆包
//		对于一个数据直接使用object来描述。
		Object obj = 3;  //自动识别到后方的类型为Integer，
		Integer a = (Integer)obj; //将父类转化为子类
		int b = (int)obj;  // 数据类型的强制转换
//		或者这样写：	
//		int b = (Integer)obj;


		Object obj1 = 3.0;
		Double c = (Double)obj1;
		double cValue = c;
		Integer d = (int)cValue;
		
		
		Person p1 = new Person();
		
		
		
//		Class：可以看到对象真实的类型
		p1.getClass();
//		person类的类
		Class<Person> e = Person.class;
		Field [] fields = e.getDeclaredFields();   //获取所有属性
		System.out.println(Arrays.toString(fields));
		try {
			Person per3 = e.newInstance(); //	相同功能
			Person per4 = new Person();//	相同功能
//			如何用反射的方式给对象的属性进行赋值或者修改
			Field f1 = fields[0];
			Object name = f1.get(per3);  
//			name.getClass();
			//取到对应对象的指定属性，即 String name = per3.name;
			f1.set(per3, "Molly"); // 即设置对应对象的属性为，即 per3.name = "Molly"
			
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
		
		
		
//		实际的类，获取class，其实获取了一个class这个类的对象
//		Object f = Person.class;
		
		
//		简单理解反射，就是我们可以假设有一束x射线照射到类的内部。
//		就可以在外部通过，看到里面的属性和方法列表
		
	}	

}
