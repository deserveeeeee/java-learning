package com.Practice.Ch7.Day1.Class;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. ����һ������10�������ַ�����ArrayList��������Ԫ�صĺͣ���Ϊint����
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tenNum = new ArrayList<String>();
		int sum = 0;
		for(int i = 0;i<=9;i++){
			tenNum.add(sc.nextLine());
			sum += Integer.parseInt(tenNum.get(i));
		}
		System.out.println(sum);
		
		
//		2. ��һ��ѧ��Student�������������ֵ��name, age, height, id�������η���ArrayList, ������ȫ��ʹ��String��
		ArrayList<Object> student = new ArrayList<Object>();
		student.add("����");
		student.add(23);
		student.add(188);
		student.add(25279);
		
//		3. ����3��Student���󣬷���ArrayList��Ȼ�����������С���ˡ�
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student(34,"����");
		Student s2 = new Student(23,"����");
		Student s3 = new Student(45,"����");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if (o1.age > o2.age) {
					return 1;
				}else if (o1.age < o2.age) {
					return -1;
				}
				return 0;
				}
			});
		System.out.println(students.get(0).name);
	
//		4. ˼���⣺��Student��������һ�����ԣ���ʾ���ѧ�������пγ̳ɼ��������ArrayList����
//		�γ̰������ġ���ѧ��Ӣ����ۡ����۵ȣ�Ȼ����㣺
		s1.examination(43,78,90,56,67);
		s2.examination(56,81,64,77,40);
		s3.examination(40,91,48,86,58);
		
//		a. ƽ���ֹ�60��ѧԱ
		for(int i = 0;i<3;i++){
			if(students.get(i).ave()>=60){
				System.out.println(students.get(i).name + "ͬѧƽ���ֳ�����60");
			}
		}

//		b. ���������Ͽγ̲������ѧԱ
		for(int i = 0;i<3;i++){
			if(students.get(i).failCount()>2){
				System.out.println(students.get(i).name + "ͬѧ���������Ͽγ̲�����");
			}
		}
		
//		c. ÿ����Ŀ�ĵ�һ��ѧԱ
		for (int i = 0; i < 5; i++) {
			int j = i;
			students.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					if (o1.scores.get(j) > o2.scores.get(j)) {
						return 1;
					}else if (o1.scores.get(j) < o2.scores.get(j)) {
						return -1;
					}
					return 0;
					}
				});
			switch (j) {
			case 0:System.out.print("���Ŀ�Ŀ�ɼ���õ�ѧ����");
				break;
			case 1:System.out.print("��ѧ��Ŀ�ɼ���õ�ѧ����");
				break;
			case 2:System.out.print("Ӣ���Ŀ�ɼ���õ�ѧ����");
				break;
			case 3:System.out.print("���ۿ�Ŀ�ɼ���õ�ѧ����");
				break;
			case 4:System.out.print("���ۿ�Ŀ�ɼ���õ�ѧ����");
				break;
			}
			System.out.println(students.get(2).name);
		}
		

		sc.close();
	}
}
