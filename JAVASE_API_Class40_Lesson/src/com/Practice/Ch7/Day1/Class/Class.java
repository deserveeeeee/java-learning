package com.Practice.Ch7.Day1.Class;

import java.util.ArrayList;
import java.util.Comparator;

public class Class {
	ArrayList<Student> students = new ArrayList<Student>();
	
	void allStudents(){
		this.students.add(new Student(34,"����",new int [] {43,78,90,56,67}));
		this.students.add(new Student(23, "����", new int [] {56,81,64,77,40}));
		this.students.add(new Student(45,"����",new int [] {40,91,48,86,58}));
	}
	
	void leastAge(){
		
	}
	
	/*ƽ���ֳ���60�ֵ�ͬѧ������*/
	void allStudentsAve(){
		for (Student i : students) {
			if(i.ave()>=60){
				System.out.println(i.name + "ͬѧƽ���ֳ�����60");
			}
		}
	}
	
	/*�ҿ���������λ��ͬѧ������*/
	void allStudentsFailcount(){
		for (Student i : students) {
			if(i.failCount()>2){
				System.out.println(i.name + "ͬѧ���������Ͽγ̲�����");
			}
		}
	}
	
	
	
//	students.sort(new Comparator<Student>() {
//		@Override
//		public int compare(Student o1, Student o2) {
//			// TODO Auto-generated method stub
//			if (o1.age > o2.age) {
//				return 1;
//			}else if (o1.age < o2.age) {
//				return -1;
//			}
//			return 0;
//			}
//		});
//	System.out.println(students.get(0).name);
}
