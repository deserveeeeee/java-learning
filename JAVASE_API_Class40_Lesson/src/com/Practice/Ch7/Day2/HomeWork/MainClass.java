package com.Practice.Ch7.Day2.HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
//		��ҵ��
//		1.	����z�������������͡�l��:�����ġ�,����map��
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("z", "����");
		map1.put("1", "����");
		
		
//		2.	��a��e��i��o��u�⼸����ĸ�Ͷ�Ӧ��ASCII��Ž�һ��map
		Map<Character, Integer> map2 = new HashMap<Character,Integer>();
		Character [] xCharacters = {'a','e','i','o','u'};
		for (Character character : xCharacters) {
			map2.put(character,Integer.valueOf(character));
		}
		System.out.println(map2);
		
		
//		3.	������Ӣ������е�ÿ�����ʺ�����Ӧ�����ķ��룬����һ��map��Java is the best programming language!
		Map<String, String> map3 = new HashMap<String, String>();
//		String sentence = new String("Java is the best programming language!");
		String [] sentence1 = {"Java","is","the","best","programming","language"};
		String [] sentence2 = {"Java","��","��","�����","���","����"};
		for (int i = 0; i < sentence1.length; i++) {
			map3.put(sentence1[i],sentence2[i]);
		}
		System.out.println(map3);
		
		
//		4.	������map�У���Java�ֶζ�Ӧ�����ĸĳɡ����ȡ���
		map3.replace("Java", "Java", "����");
		System.out.println(map3);
		System.out.println(map3.keySet());
		
		
//		5.	������map�У�ɾ��������ĸa�ĵ��ʡ�
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
		
		
//		6.	������map�У�ȡ���������ģ�����һ�仰��
		String sentence = "";
		for (String string : map3.keySet()) {
			sentence += (string + " ");
		}
		System.out.println(sentence);
		
		
//		7.	����Person�࣬����animal�ࣺ
//		a. ��Person������һ�����ԣ���������˵����г��
//		b. Person���ֻ������ֻ���
//		c. Person���Ը���ϲ���̶�����˼���������Ӧ��������ã�
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
	
//	8.Ԥϰ
//	1. �Զ����쳣�ࡢ�ļ�����
//	������쳣������ʱ�쳣������
//	Throwable
//	
}
