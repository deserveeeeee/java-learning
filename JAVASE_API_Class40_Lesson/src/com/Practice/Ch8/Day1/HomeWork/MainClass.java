package com.Practice.Ch8.Day1.HomeWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
//		��һ��
		/*
 <js>

  var num = [20,8,15,11,13,7,17];
  for (var i = 0; i < num.length; i++) {
    for (var j = 0; i < num.length - 1- i; j++) {
      if(num[j] > num[j+1]{}{
        var tmp = num[j];
        num[j] = num[j+1];
        num[j+1] = tmp;
      }
    }
  }


  function find(){


    var xScript1 = ;
    var xScript2 =;

    var xScript;
    var yScript;

    var cScript;
    var c = num[Math.parseInt(num.length/2)];


    if( 11 < c){
      yScript = cScript;
      xScript = 0;
    }else if(11 > c) {
      xScript = cScript;
      xScript = num.length -1;
    }else if (11 == c) {
      return cScript;
    }

    while (true) {
      if( 11 < c){
        yScript = cScript;
        cScript = Math.parseInt((yScript - xScript)/2);
        c = num[Math.parseInt(cScript)];
      }else if(11 > c) {
        xScript = cScript;
        cScript = Math.parseInt((xScript - yScript)/2);
        c = num[Math.parseInt(cScript)];
      }else if (11 == c) {
        return cScript;
      }
    }

  }
</js>


		 */
//		�ڶ���
		outNums();
//		������
		System.out.println(sum());
//		������
		hMap();
//		������
		readFile();
	}
	
	
	
//	�ڶ���
	static public void outNums(){
		System.out.println("������һ���ַ���");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
//		�������ת������Ч���ֻᱨ�쳣��
		Integer x = Integer.valueOf(input);
		
		ArrayList<Integer> yArrayList = new ArrayList<Integer>();
		Integer sum = 0;
		
		for (int i = 0; i < input.length(); i++) {
			yArrayList.add(Integer.valueOf(input.substring(i, i+1)));
			sum += Integer.valueOf(input.substring(i, i+1));
		}
//		�½�����
		yArrayList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return -1;
				}else if(o1 < o2){
					return  1;
				}
				return 0;
			}
		});
		
		for (Integer i : yArrayList) {
			System.out.println(i);
		}
		
		System.out.println(sum);
	}
//	������
	static public Integer sum(){
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		int x = 1;
		for (int i = 0; i < nums.length; i++) {
			x *= nums[i];
			sum += x;
		}
		return sum;
	}
	
//	�����⣺
	
	static public void hMap(){
		Map<Integer, String> xMap = new HashMap<Integer,String>();
		xMap.put(14, "wer");
		xMap.put(20, "3rewr");
		xMap.put(6, "erg");
//		�½�һ��ArrayList��װ
		ArrayList<Integer> xArrayList = new ArrayList<Integer>(); 
		for (Integer y : xMap.keySet()) {
			xArrayList.add(y);
		}
//		��������
		xArrayList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return 1;
				}else if(o1 < o2){
					return -1;
				}
				return 0;
			}
		});
		
		for (Integer integer : xArrayList) {
			System.out.println(integer + "= " + xMap.get(integer));
		}
	}

	
//	������
	static public void readFile(){
//		�ҵ��ļ�
		File xFile = new File("D:\\exam.txt");
//		�½�����
		ArrayList<String> lines = new ArrayList<String>();
//		�����������
		try {
			FileReader fileReader = new FileReader(xFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while(line != null){
				lines.add(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			for (String string : lines) {
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
