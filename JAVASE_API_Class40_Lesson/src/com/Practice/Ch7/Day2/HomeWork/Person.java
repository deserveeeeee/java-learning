package com.Practice.Ch7.Day2.HomeWork;

import java.util.ArrayList;
import java.util.Comparator;

public class Person {
//	Animal [] ownPets = new Animal[3];  /*����һ�������ӵ�г��������*/
//	int ownCounts = 0; /*����һ�������ӵ�г��������*/
	
	/*����һ����ӵ����֪����*/
//	void havePet(String category,String name,int like){
//		new Animal(category,name,like);
//		ownCounts ++;
//	}
	
	
	/*���ĳ��ﰴ��ϲ���̶Ƚ�������*/
//	void sort() {
//		Animal tmp;
//		for (int i = 0; i < ownPets.length; i++) {
//			for (int j = 0; j < ownPets.length -1 -i; j++) {
//				if (ownPets[j].like < ownPets[j+1].like) {
//					tmp = ownPets[j];
//					ownPets[j] = ownPets[j + 1];
//					ownPets[j + 1] = tmp;
//				}
//			}
//		}
//	}
	
	ArrayList<Animal> ownPets = new ArrayList<Animal>();
	/*����������ӵ����֪����*/
	void havePet(String category,String name,int like){
		if(ownPets.size()<3){
			ownPets.add(new Animal(category,name,like));
		}else {
			System.out.println("���ʧ�ܣ���������ӵ�и���ĳ�������");
		}
	}
	
	/*�����������ĳ��ﰴ��ϲ���̶Ƚ�������*/
	void sort(){
		ownPets.sort(new Comparator<Animal>() {
			@Override
			public int compare(Animal o1, Animal o2) {
				if (o1.like > o2.like) {
					return -1;
				}else if(o1.like < o2.like) {
					return 1;
				}
				return 0;
			}
		});
	}
}
