package com.Practice.Ch7.Day1.Class;

import java.util.ArrayList;

public class Student {
	int age;
	String name;
	ArrayList<Integer> scores = new ArrayList<Integer>();
	
	public Student(int age,String name){
		this.age = age;
		this.name = name;
	}
	
	public void examination(int scoreChiese,int scoreMath,
			int scoreEnglish,int scoreScience,int scoreArts){
		this.scores.add(scoreChiese);
		this.scores.add(scoreMath);
		this.scores.add(scoreEnglish);
		this.scores.add(scoreScience);
		this.scores.add(scoreArts);
	}
	/*ƽ��ֵ����*/
	public double ave(){
		int sumScore = 0;
		for(int i = 0;i<=4;i++){
			sumScore += (this.scores.get(i));
		}
		return (sumScore/5);
		
	}
	
	/*ѧ���ҿ�������*/
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
