package com.Practice.Ch7.Day1.Class;

public class StackMemory {
	
//	ջʽ���ݽṹ���Ƚ����
	int [] a = new int[10];
//	��ջ
	void in (int a){
		for (int i = 0; i < this.a.length; i++) {
			if (this.a[i] == 0) {
				this.a[i] = a;
				break;
			}
		}
	}
//	��ջ
	int out(){
		return 0;
	}
}
