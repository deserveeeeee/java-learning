package com.Practice.Ch7.Day3.HomeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Person {
	String name;
	int age;
	String id;
	
	public Person(){};
	public Person(String name,int age,String id){
		this.name = name;
		this.age = age;
		this.id = id;
		saveAttributes();
	}
	
	public void saveAttributes(){
		String separator = System.getProperty("line.separator");  
		File file = new File("C:\\Users\\Administrator\\Desktop\\"+this.name+".txt");
		if (! file.exists()) {
			try {
				file.createNewFile();
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write(this.name + separator 
						+ this.age + separator
						+ this.id);
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public ArrayList<String> outputAttributes(){
		ArrayList<String> tmp = new ArrayList<String>();
		File file = new File("C:\\Users\\Administrator\\Desktop\\"+this.name+".txt");
		FileReader fileReader;
		try {
			fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			try {
				String line = bufferedReader.readLine();
				while( line != null){
					tmp.add(line);
					line = bufferedReader.readLine();
				}
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tmp;
	}
	
	
	public void copyPerson(){
		ArrayList<String> tmp = this.outputAttributes();
		new Person("Cope"+tmp.get(0),
			Integer.parseInt(tmp.get(1)), 
			tmp.get(2));
	}
}
