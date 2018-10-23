package com.Practice.Ch7.Day1.Class;

import java.awt.datatransfer.StringSelection;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		数组的特点：
//		1、有序；2、长度固定；3、同类型；4、下标访问；5、可例举for each
//		数组的问题：
//		1、长度固定了，不方便；2、类型不能不同；3、没有一一对应关系；
//		集合框架：collection
//		一一对应、有序下标、增删（链表 LINK）、查改（数组 Array）、查唯一（字典MAP）、无序（集 SET）
//		集合对象 api
//		Arrays →普通数组的对象，常规数组的工具类。
//		Arrays.sort();
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		nums.set(0,5)
//		从今天开始，接下来2周的每天凌晨0点时刻，放入一个ArrayList。
//		ArrayList<E> xArrayList = new ArrayList<>();
//		Date time = new 
//		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		Date todayDate = today.parse("2018-10-22 00:00:00");  //转化为标准时间
//		long todayTimeMillis = todayDate.getTime();  //距离开始时间的毫秒数，即距离的毫秒数。
//		boolean action = true;
//		while(action){
//			Date now = new Date();  //得到当前的标准时刻
//			
//		}
		
		ArrayList<Date> dates = new ArrayList<Date>();
		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date todayDate = today.parse("2018-10-22 00:00:00");  //转化为标准时间
//		for (int i = 23; i <32; i++) {
//			Date somedayDate = someday.parse("2018-10-"+i+" "+"00:00:00");
//			dates.add(somedayDate);
//		}
//		for (int i = 1; i <7; i++) {
//			Date somedayDate = someday.parse("2018-11-"+i+" "+"00:00:00");
//			dates.add(somedayDate);
//		}
		
		for (int i = 1; i <15 ; i++) {
			Date somedayDate = new Date(todayDate.getTime() + 24*60*60*1000 * i);
			dates.add(somedayDate);
		}
		
		System.out.println(dates);
		
		
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("123ew");
		strings.add("wq3rewaer");
		strings.add("werq3w");
		strings.add("2q3rwe");
		strings.add("efsw");
		
		strings.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length() > o2.length()) {
					return 1;
				}else if (o1.length() < o2.length()) {
					return -1;
				}
				return 0;
				}
			});
		
		
//		预习一：学习链式结构、双链表、二叉树、B+数
//		链式结构
		LinkedList<String> list = new LinkedList<String>();
		list.pop();
		list.push("");
//		LinkedList 在处理头尾的时候效率极高，处理中间的时候效率很低。
//		处理插入、删除，效率很高；处理查找、修改的效率很低。
//		LinkedList经常用来处理堆、栈问题。
//		LinkedList和ArrayList功能几乎一样的集合，都是线性的类数组结构。
		
		
//		预习二：字典Map
//		链值对结构，字典
		


	}
}
