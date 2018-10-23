package com.Practice.Ch7.Day2.Class;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MainClass {

	public static void main(String[] args) {

		String names [] = {"Bod","Cindy","David","Tony","Timmy",
				"Bill","Athena","Smith","Jones"};
		String codes [] = {"20180102","20180103","20180104","20180105",
				"20180106","20180107","20180108","20180109","20180110"};
		int [] ages = {34,12,34,52,13,45,26,26,31};
		// 1. 建立一个head
		final Node head = new Node();
		head.name = "Amy";
		head.code = "20180101";
		head.age = 23;
		
		// 2. 创建2个引用：移位、节点
		Node p = null; //节点引用
		Node q = head; //移位引用
	
		// 3. 依次创建每个节点，将前后节点连线
		for (int i = 0; i < 9; i++) {
			p = new Node();
			p.name = names[i];
			p.code = codes[i];
			p.age = ages[i];
			q.next = p;
			q = p;
		}
		
		// 4.给每个
		
		

//		键值对 key对应value
		Map<String, String> maps = new HashMap<String,String>();
		maps.put("Katie", "Android,WordPress");
		maps.put("Magda", "Facebook");
		maps.put("Vanessa", "Tools");
		maps.put("Ania", "JEE");
//		建立了这样一个map，是通过key来查询value
		
		String value = maps.get("Ania");
		System.out.println(value);
//		那么对于key和value而言，它们是否可以重复?
		maps.put("Ania", "JEE");
//		当key值重复的时候,前一个key和它的value会被覆盖.
//		虽然是乱序,但每次乱序都一样的乱
		
		maps.remove("Ania"); //使用key来操作map 
		maps.putIfAbsent("Ania", "lalala");  //如果有一样的key，则不覆盖
		
		maps.replace("Ania", "Wulala");  //如果有key则替换，如果没有则不替换
										// replace 不会增加数据
		maps.remove("Ania", "Wulala"); //它的存在的意义就在于指定删除是哪一个value
										//因为会出现多个key指向一个value的现象
										//这样能够保证具体删除的是哪一个key和value
		// keyset() 是返回所有的key
		// set是存放无序不存放的，要么取任意一个，要么取所有
		// values() 是返回所有的value
		for (Object key : maps.keySet()) {
			System.out.println(key);
		}
		
		// 正常情况下map是无序的
		
		
//		Set<String> 
	}

}
