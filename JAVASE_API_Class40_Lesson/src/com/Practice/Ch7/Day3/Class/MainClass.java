package com.Practice.Ch7.Day3.Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class MainClass {
//	�ݹ�
//	�ݹ��㷨���ÿռ任ʱ��
	/*
	static void print(int n){
		if(n > 0){
			System.out.println(n);
			print(n - 1);
			System.out.println(n);
		}
	}
	/*
	/*
	static void printPath(String path){
		String [] names = new File(path).list();  //�����path�ķ������г����е�file��directory�ĵ�ַ�Ž�names���string����֮��
		for (String name : names) {
			
		}
		if(new File(path).isDirectory()){
			System.out.println(Arrays.toString(new File(path).listFiles()));
		}
	}
	*/
	/*
	static void printPath(File file){
		File[] files = file.listFiles();
		for (File fileTmp : files) {
			System.out.println(fileTmp);
			if (fileTmp.isDirectory()) {
				printPath(fileTmp);
			}
		}
	}
	/*
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1 = new Person(name)
		
//		·�� 
		/*	String path = "D:\\books";
		File file = new File(path);   //��ĳ��·�����ļ�����
		System.out.println(file);
		*/
		
	//	printPath(new File("D:\\HBuilder.9.1.19.windows"));
//		�ѵݹ������һ�������̣��������Ǵ�������з����Ǵ������⡣
		File file = new File("C:\\Users\\Administrator\\Desktop\\file.txt");
			try {
				FileReader reader = new FileReader(file);   //��ȡ�ļ�
				BufferedReader bufferReader = new BufferedReader(reader);   //��ȡ
				String line = bufferReader.readLine();
				while(line != null){
					System.out.println(line);
					line = bufferReader.readLine();
				}
				bufferReader.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			ע�����
//			1����ȡʱfile��һ���ļ�����һ���ļ��У�
//			2����ȡʱ������������жϵģ���ͬ��������ͬ�ļ���ʽ�ᵼ�»����в���
			
			/*д�����*/
			File file2 = new File(file.getAbsolutePath().replace("file", "file2"));
			
			
	}
}
