package com.Practice.Ch7.Day2.HomeWork;

public class Person {
	Animal [] ownPets = new Animal[3];
	int ownCounts = 0; /*这个人拥有宠物的数量*/
	
	/*新拥有已知宠物*/
	void havePet(String category,String name,int like){
		new Animal(category,name,like);
		ownCounts ++;
	}
	
	
	/*将的宠物按照喜欢程度进行排序*/
	void sort() {
		Animal tmp;
		for (int i = 0; i < ownPets.length; i++) {
			for (int j = 0; j < ownPets.length -1 -i; j++) {
				if (ownPets[j].like < ownPets[j+1].like) {
					tmp = ownPets[j];
					ownPets[j] = ownPets[j + 1];
					ownPets[j + 1] = tmp;
				}
			}
		}
	}

}
