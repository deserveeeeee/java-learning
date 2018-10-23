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
		// 1. ����һ��head
		final Node head = new Node();
		head.name = "Amy";
		head.code = "20180101";
		head.age = 23;
		
		// 2. ����2�����ã���λ���ڵ�
		Node p = null; //�ڵ�����
		Node q = head; //��λ����
	
		// 3. ���δ���ÿ���ڵ㣬��ǰ��ڵ�����
		for (int i = 0; i < 9; i++) {
			p = new Node();
			p.name = names[i];
			p.code = codes[i];
			p.age = ages[i];
			q.next = p;
			q = p;
		}
		
		// 4.��ÿ��
		
		

//		��ֵ�� key��Ӧvalue
		Map<String, String> maps = new HashMap<String,String>();
		maps.put("Katie", "Android,WordPress");
		maps.put("Magda", "Facebook");
		maps.put("Vanessa", "Tools");
		maps.put("Ania", "JEE");
//		����������һ��map����ͨ��key����ѯvalue
		
		String value = maps.get("Ania");
		System.out.println(value);
//		��ô����key��value���ԣ������Ƿ�����ظ�?
		maps.put("Ania", "JEE");
//		��keyֵ�ظ���ʱ��,ǰһ��key������value�ᱻ����.
//		��Ȼ������,��ÿ������һ������
		
		maps.remove("Ania"); //ʹ��key������map 
		maps.putIfAbsent("Ania", "lalala");  //�����һ����key���򲻸���
		
		maps.replace("Ania", "Wulala");  //�����key���滻�����û�����滻
										// replace ������������
		maps.remove("Ania", "Wulala"); //���Ĵ��ڵ����������ָ��ɾ������һ��value
										//��Ϊ����ֶ��keyָ��һ��value������
										//�����ܹ���֤����ɾ��������һ��key��value
		// keyset() �Ƿ������е�key
		// set�Ǵ�����򲻴�ŵģ�Ҫôȡ����һ����Ҫôȡ����
		// values() �Ƿ������е�value
		for (Object key : maps.keySet()) {
			System.out.println(key);
		}
		
		// ���������map�������
		
		
//		Set<String> 
	}

}
