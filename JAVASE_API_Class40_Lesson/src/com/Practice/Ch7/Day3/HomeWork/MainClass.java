package com.Practice.Ch7.Day3.HomeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ҵA��
//		1. ����������������ļ���
		File  desktop = new File("C:\\Users\\Administrator\\Desktop");
		File [] files = desktop.listFiles();
		ArrayList<String> filesQQ = new ArrayList<String>();
		
		for (File file : files) {
			if (file.isFile()) {
				filesQQ.add(file.getName());
				System.out.println(file.getName());
			}
		}
		
//		2. �������ϲ�����û�а���qq���ļ���
		boolean exit = false;
		for (String file : filesQQ) {
			if(file.contains("qq")){
				exit = true;
			}
		}
		System.out.println(exit);
		
//		3. ����׵ľ�ҹ˼��д��ָ��Ŀ¼���ļ��С�
		File  jingyesi = new File("C:\\Users\\Administrator\\Desktop\\jingyesi.txt");
		String jys = "����ҹ˼��"+ \n +"���ƣ����"
��ǰ���¹⣬
���ǵ���˪��
��ͷ�����£�
��ͷ˼���硣"
		try {
			jingyesi.createNewFile();
			FileWriter writer = new FileWriter(jingyesi);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		4. ��3�����֮�󣬴ӵ�3����ļ��ж�ȡ���ݣ�����������׵ġ������ơ���Ȼ��д����һ���ļ��С�
//
//		��ҵB:
//		1. ��Person����һ��������ʹ���ܹ�����������(name��age��id)д���ļ����档
//		2. ��������ɺ󣬴Ӷ�Ӧ�ļ��ж���Person��Ȼ����������ԭ������ĸ����塣

	}

}
