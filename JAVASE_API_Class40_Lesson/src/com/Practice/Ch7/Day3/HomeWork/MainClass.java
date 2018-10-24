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
//		作业A：
//		1. 输出你的桌面的所有文件名
		File  desktop = new File("C:\\Users\\Administrator\\Desktop");
		File [] files = desktop.listFiles();
		ArrayList<String> filesQQ = new ArrayList<String>();
		
		for (File file : files) {
			if (file.isFile()) {
				filesQQ.add(file.getName());
				System.out.println(file.getName());
			}
		}
		
//		2. 在桌面上查找有没有包含qq的文件名
		boolean exit = false;
		for (String file : filesQQ) {
			if(file.contains("qq")){
				exit = true;
			}
		}
		System.out.println(exit);
		
//		3. 将李白的静夜思，写入指定目录的文件中。
		File  jingyesi = new File("C:\\Users\\Administrator\\Desktop\\jingyesi.txt");
		String jys = "《静夜思》"+ \n +"［唐］李白"
床前明月光，
疑是地上霜。
举头望明月，
低头思故乡。"
		try {
			jingyesi.createNewFile();
			FileWriter writer = new FileWriter(jingyesi);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		4. 第3题完成之后，从第3题的文件中读取内容，在其后加入李白的《将进酒》，然后写入另一个文件中。
//
//		作业B:
//		1. 给Person增加一个方法，使其能够将所有属性(name、age、id)写入文件保存。
//		2. 第三题完成后，从对应文件中读出Person，然后重新生成原来对象的复制体。

	}

}
