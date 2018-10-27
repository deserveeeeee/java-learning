package com.Practice.Ch7.Day6.HomeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		/*
		long x = 24 * 24 * 60 * 1000 * 1000;
		System.out.println(x);
		long y = 24 * 24 * 60 * 1000;
		System.out.println(y);
		
		System.out.println(x/y);
		int intProduct = 24 * 60 * 60 * 1000 * 1000;
		
        long longProduct = 24L * 60 * 60 * 1000 * 1000;
        long longProduct1 = 24 * 60 * 60 * 1000 * 1000;
        System.out.println(intProduct); // Prints 500654080
        System.out.println(longProduct); // Prints 86400000000
        System.out.println(longProduct1); // Prints 500654080
        
        int a = 1/2;
        System.out.println(a);
        double b = 1/2;
        System.out.println(b);
        
        
        BigDecimal two = new BigDecimal("2.0");
        BigDecimal one = new BigDecimal("1.1");
        System.out.println(two.subtract(one));
        */
		/*
		int [] myArray = new int[]{1,2,3};
		 System.out.println(Arrays.toString(myArray));
		 myArray = new int[6];
		 System.out.println(Arrays.toString(myArray));
		  */
		/*
		File file1 = new File("C:\\Users\\Administrator\\Desktop\\jingyesi.txt");
		File file2 = new File("C:\\Users\\Administrator\\Desktop\\jingyesi2.txt"); 
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tmp = "";
		try {
			FileReader reader = new FileReader(file1);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			while (line != null) {
				tmp += line;
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			
			FileWriter writer = new FileWriter(file2);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(tmp);
			bufferedWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  */
		/*
		int score [] = {67,69,75,87,90,99,100};
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length -1 - i; j++) {
				if(score[j] < score[j+1]){
					int tmp;
					tmp = score[j+1];
					score[j+1] = score[j];
					score[j] = tmp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		*/
		/*
		for (int i = 1, j = 1 + 10; i < 5; i++, j = i * 2) {
			System.out.println("i=" + i + "j=" + j);
		}
		*/
		/*
		int [] arr1 = {1,3,5,7};
		int [] arr2 = new int [4];
		for (int i = 0; i < arr1.length; i++) {
			arr2[arr1.length - i - 1] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		*/
		/*
		SimpleDateFormat x = new SimpleDateFormat("yyyy-MM-dd");
		Date yDate;
		try {
			yDate = x.parse("2017-07-24");
			System.out.println(yDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		ArrayList<String> x = new ArrayList<String>();
		String [] aStrings = new String[]{"a","b","c","d","e","1","2","3","4","5"};
		for (String string : aStrings) {
			x.add(string);
		}
			System.out.println(x);
		
		
		Map<String, String> xMap = new HashMap<String,String>();
		for (int i = 0; i < aStrings.length/2; i++) {
			xMap.put(aStrings[i], aStrings[i+5]);
		}
		System.out.println(xMap);
	}
	
}
