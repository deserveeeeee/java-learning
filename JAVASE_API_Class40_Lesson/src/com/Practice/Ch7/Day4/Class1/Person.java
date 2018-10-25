package com.Practice.Ch7.Day4.Class1;

public class Person {
	String name;
	String id;
	
	@Override
	public boolean equals(Object obj) {
		Person other = (Person)obj;
		if(this.name.equals(other.name) && this.id.equals(other.id)){
			return true;
		}
		return false;
	}
	
	public void run(){
		System.out.println("run");
	}
	
	public void eat(){
		System.out.println("eat");
	}
}
