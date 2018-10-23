package com.Practice.Ch7.Day2.HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
//		作业：
//		1.	将“z”：“张三”和“l“:“李四”,放入map，
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("z", "张三");
		map1.put("1", "李四");
		
		
//		2.	将a、e、i、o、u这几个字母和对应的ASCII码放进一个map
		Map<Character, Integer> map2 = new HashMap<Character,Integer>();
		Character [] xCharacters = {'a','e','i','o','u'};
		for (Character character : xCharacters) {
			map2.put(character,Integer.valueOf(character));
		}
		System.out.println(map2);
		
		
//		3.	将如下英文语句中的每个单词和它对应的中文翻译，放入一个map。Java is the best programming language!
		Map<String, String> map3 = new HashMap<String, String>();
//		String sentence = new String("Java is the best programming language!");
		String [] sentence1 = {"Java","is","the","best","programming","language"};
		String [] sentence2 = {"Java","是","这","最棒的","编程","语言"};
		for (int i = 0; i < sentence1.length; i++) {
			map3.put(sentence1[i],sentence2[i]);
		}
		System.out.println(map3);
		
		
//		4.	从上述map中，将Java字段对应的中文改成“咖啡”。
		map3.replace("Java", "Java", "咖啡");
		System.out.println(map3);
		System.out.println(map3.keySet());
		
		
//		5.	从上述map中，删除包含字母a的单词。
		ArrayList<String> templist = new ArrayList<String>();
		for (String i : map3.keySet()) {
			System.out.println(i);
			if (i.contains("a")) {
				templist.add(i);
			}
		}
		for (String string : templist) {
			map3.remove(string);
		}
		System.out.println(map3);
		
		
//		6.	从上述map中，取出所有中文，连成一句话。
		String sentence = "";
		for (String string : map3.keySet()) {
			sentence += (string + " ");
		}
		System.out.println(sentence);
		
		
//		7.	建立Person类，建立animal类：
//		a. 给Person类增加一个属性，描述这个人的所有宠物。
//		b. Person最多只能有三只宠物。
//		c. Person可以根据喜爱程度排序（思考这个属性应该如何设置）
		Person p1 = new Person();
		p1.havePet("cat", "Tom", 5);
		p1.havePet("Dog", "Jerry", 11);
		p1.havePet("Horse", "Jack", 8);
		p1.havePet("fish", "water", 3);
		p1.sort();
		for (Animal pet : p1.ownPets) {
			System.out.println(pet.getAnimal());
		}
		
	}
	
//	8.预习
//	1. 自定义异常类、文件操作
//	检查类异常、运行时异常、错误
//	Throwable
//	
}
