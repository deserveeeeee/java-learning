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
		 String separator = System.getProperty("line.separator");  
		File  jingyesi = new File("C:\\Users\\Administrator\\Desktop\\jingyesi.txt");
		String jys = "《静夜思》"+ separator 
				+"［唐］李白" + separator
				+"床前明月光，"+separator
				+ "疑是地上霜。"+separator
				+ "举头望明月，"+separator
				+ "低头思故乡。";
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
		
		
//		4. 第3题完成之后，从第3题的文件中读取内容，在其后加入李白的《将进酒》，然后写入另一个文件中。
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
				String qjj = "《将进酒》"+ separator 
						+"［唐］李白" + separator
						+"君不见，黄河之水天上来，奔流到海不复回。"+separator
						+ "君不见，高堂明镜悲白发，朝如青丝暮成雪！"+separator
						+ "人生得意须尽欢，莫使金樽空对月。"+separator
						+ "天生我材必有用，千金散尽还复来。"+separator
						+ "烹羊宰牛且为乐，会须一饮三百杯。" +separator
						+ "岑夫子，丹丘生，将进酒，杯莫停。" +separator
						+ "与君歌一曲，请君为我倾耳听。" +separator
						+ "钟鼓馔玉不足贵，但愿长醉不复醒。" +separator
						+ "古来圣贤皆寂寞，惟有饮者留其名。" +separator
						+ "陈王昔时宴平乐，斗酒十千恣欢谑。" +separator
						+ "主人何为言少钱，径须沽取对君酌。" +separator
						+ "五花马、千金裘，呼儿将出换美酒，与尔同销万古愁！";
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
			
		
		
		
//		作业B:
//		1. 给Person增加一个方法，使其能够将所有属性(name、age、id)写入文件保存。
		new Person("Molly",23,"20180101").copyPerson();;
		
//		2. 第三题完成后，从对应文件中读出Person，然后重新生成原来对象的复制体。

	}

}
