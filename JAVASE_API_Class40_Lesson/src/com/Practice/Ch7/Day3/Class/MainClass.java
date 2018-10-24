package com.Practice.Ch7.Day3.Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class MainClass {
//	递归
//	递归算法是用空间换时间
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
		String [] names = new File(path).list();  //把这个path的访问罗列出所有的file和directory的地址放进names这个string数组之中
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
		
//		路径 
		/*	String path = "D:\\books";
		File file = new File(path);   //对某个路径的文件访问
		System.out.println(file);
		*/
		
	//	printPath(new File("D:\\HBuilder.9.1.19.windows"));
//		把递归想象成一个蚊香盘，有正向是从外往里，有反向是从内往外。
		File file = new File("C:\\Users\\Administrator\\Desktop\\file.txt");
			try {
				FileReader reader = new FileReader(file);   //读取文件
				BufferedReader bufferReader = new BufferedReader(reader);   //读取
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
//			注意事项：
//			1、读取时file是一个文件而非一个文件夹；
//			2、读取时，换行是如何判断的，不同环境、不同文件格式会导致换行有差异
			
			/*写入操作*/
			File file2 = new File(file.getAbsolutePath().replace("file", "file2"));
			
			
	}
}
