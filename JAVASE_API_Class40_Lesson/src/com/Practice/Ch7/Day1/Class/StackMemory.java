package com.Practice.Ch7.Day1.Class;

public class StackMemory {
	
//	栈式数据结构：先进后出
	int [] a = new int[10];
//	进栈
	void in (int a){
		for (int i = 0; i < this.a.length; i++) {
			if (this.a[i] == 0) {
				this.a[i] = a;
				break;
			}
		}
	}
//	出栈
	int out(){
		return 0;
	}
}
