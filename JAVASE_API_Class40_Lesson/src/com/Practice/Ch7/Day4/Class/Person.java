package com.Practice.Ch7.Day4.Class;

public class Person {
	String name;
	int age;
	
	@Override
//	Ҫʵ�ֶ�һ�����෽������д������������ʹ�����������á�
//	��Ϊ��������д��������ǲ��ܱ�
//	��д���������Ŀ����Ϊ���Լ�����һ����person����equals��������д
//	object��equals�����Աȵ������ǵ����ã�����ַ�Ƿ���ͬ
//	������Ҫ�Ա��������������ֵ�ǲ���һ�����������
//	���Դ���Ĳ���һ����һ��object�����ࣩ
	public boolean equals(Object obj) {
//		��������Ҫʹ�õ�������Ķ���
//		����������Ҫ���һ��
//		���ǰ�����Ӹ����в�����Ϳ���ʹ����
		Person other = (Person)obj;
		if (this.name.equals(other.name) && (this.age == other.age)) {
			return true;
		}
		return false;
	}
}
