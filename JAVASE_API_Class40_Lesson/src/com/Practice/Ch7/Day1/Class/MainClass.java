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
//		������ص㣺
//		1������2�����ȹ̶���3��ͬ���ͣ�4���±���ʣ�5��������for each
//		��������⣺
//		1�����ȹ̶��ˣ������㣻2�����Ͳ��ܲ�ͬ��3��û��һһ��Ӧ��ϵ��
//		���Ͽ�ܣ�collection
//		һһ��Ӧ�������±ꡢ��ɾ������ LINK������ģ����� Array������Ψһ���ֵ�MAP�������򣨼� SET��
//		���϶��� api
//		Arrays ����ͨ����Ķ��󣬳�������Ĺ����ࡣ
//		Arrays.sort();
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		nums.set(0,5)
//		�ӽ��쿪ʼ��������2�ܵ�ÿ���賿0��ʱ�̣�����һ��ArrayList��
//		ArrayList<E> xArrayList = new ArrayList<>();
//		Date time = new 
//		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		Date todayDate = today.parse("2018-10-22 00:00:00");  //ת��Ϊ��׼ʱ��
//		long todayTimeMillis = todayDate.getTime();  //���뿪ʼʱ��ĺ�������������ĺ�������
//		boolean action = true;
//		while(action){
//			Date now = new Date();  //�õ���ǰ�ı�׼ʱ��
//			
//		}
		
		ArrayList<Date> dates = new ArrayList<Date>();
		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date todayDate = today.parse("2018-10-22 00:00:00");  //ת��Ϊ��׼ʱ��
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
		
		
//		Ԥϰһ��ѧϰ��ʽ�ṹ��˫������������B+��
//		��ʽ�ṹ
		LinkedList<String> list = new LinkedList<String>();
		list.pop();
		list.push("");
//		LinkedList �ڴ���ͷβ��ʱ��Ч�ʼ��ߣ������м��ʱ��Ч�ʺܵ͡�
//		������롢ɾ����Ч�ʺܸߣ�������ҡ��޸ĵ�Ч�ʺܵ͡�
//		LinkedList������������ѡ�ջ���⡣
//		LinkedList��ArrayList���ܼ���һ���ļ��ϣ��������Ե�������ṹ��
		
		
//		Ԥϰ�����ֵ�Map
//		��ֵ�Խṹ���ֵ�
		


	}
}
