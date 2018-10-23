package com.Practice.Ch7.Day1.Class;

import java.util.ArrayList;

public class Student {
	int age;
	String name;
	ArrayList<Integer> scores = new ArrayList<Integer>();
	
	public Student(int age,String name,int scores []){
		this.age = age;
		this.name = name;
		for (int i : scores) {
			this.scores.add(i);
		}
	}
	
	
	
	/*某个学生平均分方法*/
	public double ave(){
		int sumScore = 0;
		for (Integer i: scores) {
			sumScore += (this.scores.get(i));
		}
		return (sumScore/5);
		
	}
	
	/*某个学生挂科的数量方法*/
	public int failCount(){
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if(this.scores.get(i) < 60){
				count ++;
			}
		}	
		return count;
	}
	
	
	
	
}
