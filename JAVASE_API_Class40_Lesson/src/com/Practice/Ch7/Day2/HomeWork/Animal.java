package com.Practice.Ch7.Day2.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Animal implements Comparable<Animal> {
	String category;
	String name;
	int like; //ϲ���ĳ̶ȣ�����Խ��Խϲ����
	
	public Animal() {}

	public Animal(String category,String name,int like) {
		this.category = category;
		this.name = name;
		this.like = like;
	}
	
	public Map<String, Object> getAnimal(){
		Map<String, Object> animal = new HashMap<String,Object>();
		animal.put("���������", this.name);
		animal.put("���������", this.category);
		animal.put("�Գ����ϲ���̶�", this.like);
		return animal;
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		if (this.like > o.like) {
			return 1;
		}else if(this.like < o.like) {
			return -1;
		}
		return 0;
	}
}
