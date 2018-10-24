package com.Practice.Ch7.Day2.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Animal {
	String category;
	String name;
	int like; //喜欢的程度，数字越大越喜欢。
	
	public Animal() {}

	public Animal(String category,String name,int like) {
		this.category = category;
		this.name = name;
		this.like = like;
	}
	
	public Map<String, Object> getAnimal(){
		Map<String, Object> animal = new HashMap<String,Object>();
		animal.put("宠物的名字", this.name);
		animal.put("宠物的种类", this.category);
		animal.put("对宠物的喜欢程度", this.like);
		return animal;
	}
}
