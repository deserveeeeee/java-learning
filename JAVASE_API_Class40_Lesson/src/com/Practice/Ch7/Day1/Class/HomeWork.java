package com.Practice.Ch7.Day1.Class;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 定义一个包含10个数字字符串的ArrayList，求所有元素的和，和为int类型
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tenNum = new ArrayList<String>();
		int sum = 0;
		for(int i = 0;i<=9;i++){
			tenNum.add(sc.nextLine());
			sum += Integer.parseInt(tenNum.get(i));
		}
		System.out.println(sum);
		
		
//		2. 将一个学生Student对象的所有属性值（name, age, height, id），依次放入ArrayList, 不允许全部使用String。
//		ArrayList<Object> student = new ArrayList<Object>();
//		student.add("张三");
//		student.add(23);
//		student.add(188);
//		student.add(25279);
		
//		3. 建立3个Student对象，放入ArrayList，然后查找年龄最小的人。
		

	
//		4. 思考题：给Student对象增加一个属性，表示这个学生的所有课程成绩（最好用ArrayList），
//		课程包括语文、数学、英语、理综、文综等，然后计算：
		Class woniu1 = new Class();
//		a. 平均分过60的学员


//		b. 有两门以上课程不及格的学员

		
//		c. 每个科目的第一名学员
		for (int i = 0; i < 5; i++) {
			int j = i;
			woniu1.students.sort(new Comparator<Student>() {
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
			case 0:System.out.print("语文科目成绩最好的学生是");
				break;
			case 1:System.out.print("数学科目成绩最好的学生是");
				break;
			case 2:System.out.print("英语科目成绩最好的学生是");
				break;
			case 3:System.out.print("理综科目成绩最好的学生是");
				break;
			case 4:System.out.print("文综科目成绩最好的学生是");
				break;
			}
			System.out.println(woniu1.students.get(2).name);
		}
		

		sc.close();
	}
}
