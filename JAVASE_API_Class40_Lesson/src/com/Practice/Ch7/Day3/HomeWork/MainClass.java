package com.Practice.Ch7.Day3.HomeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
		 String separator = System.getProperty("line.separator");  
		File  jingyesi = new File("C:\\Users\\Administrator\\Desktop\\jingyesi.txt");
		String jys = "����ҹ˼��"+ separator 
				+"���ƣ����" + separator
				+"��ǰ���¹⣬"+separator
				+ "���ǵ���˪��"+separator
				+ "��ͷ�����£�"+separator
				+ "��ͷ˼���硣";
		try {
			if (!jingyesi.exists()) {
				jingyesi.createNewFile();
				FileWriter writer = new FileWriter(jingyesi);
				BufferedWriter bufferedWriter = new BufferedWriter(writer);
				bufferedWriter.write(jys);
				bufferedWriter.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		4. ��3�����֮�󣬴ӵ�3����ļ��ж�ȡ���ݣ�����������׵ġ������ơ���Ȼ��д����һ���ļ��С�
		File  qiangjinjiu = new File("C:\\Users\\Administrator\\Desktop\\qiangjinjiu.txt");
		String q1 = "";
		try {
			FileReader fileReader = new FileReader(jingyesi);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			try {
				String line = bufferedReader.readLine();
				while (line != null) {
					q1 += (line+separator);
					line = bufferedReader.readLine();
				}
				bufferedReader.close();
				String qjj = "�������ơ�"+ separator 
						+"���ƣ����" + separator
						+"���������ƺ�֮ˮ���������������������ء�"+separator
						+ "�������������������׷���������˿ĺ��ѩ��"+separator
						+ "���������뾡����Īʹ���׿ն��¡�"+separator
						+ "�����Ҳı����ã�ǧ��ɢ����������"+separator
						+ "������ţ��Ϊ�֣�����һ�����ٱ���" +separator
						+ "᯷��ӣ��������������ƣ���Īͣ��" +separator
						+ "�����һ�������Ϊ���������" +separator
						+ "�ӹ�������󣬵�Ը�������ѡ�" +separator
						+ "����ʥ�ͽԼ�į��Ω��������������" +separator
						+ "������ʱ��ƽ�֣�����ʮǧ���ʡ�" +separator
						+ "���˺�Ϊ����Ǯ�������ȡ�Ծ��á�" +separator
						+ "�廨��ǧ���ã��������������ƣ����ͬ����ų";
				q1 += qjj;
				if (!qiangjinjiu.exists()) {
					qiangjinjiu.createNewFile();
					FileWriter writer = new FileWriter(qiangjinjiu);
					BufferedWriter bufferedWriter = new BufferedWriter(writer);
					bufferedWriter.write(q1);
					bufferedWriter.close();
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
//		��ҵB:
//		1. ��Person����һ��������ʹ���ܹ�����������(name��age��id)д���ļ����档
		new Person("Molly",23,"20180101").copyPerson();;
		
//		2. ��������ɺ󣬴Ӷ�Ӧ�ļ��ж���Person��Ȼ����������ԭ������ĸ����塣

	}

}
