package com.Practice.Ch7.Day4.ATM;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Tools {
	static private Scanner sc = new Scanner(System.in);
	private String [] allMsg = {
			"�����������˺ţ�",
			"�������������룺",
			"����������ѡ�",
			"����������ѡ�1.��Ǯ  2.ȡǮ",
			"���������Ľ�",
/*5*/		"������Է����˻���"
	};
	
	private String [] allNotice = {
			"��¼�ɹ�",
			"��¼ʧ�ܣ����벻��ȷ",
			"��¼ʧ�ܣ������˺Ų�����",
			"ע��ʧ�ܣ������˺��Ѵ���",
			"ע��ɹ�"
	};
	
	/*���뷽����������*/
	String input() {
		return sc.next();
	}
	
	/*���뷽������msg����*/
	String input(String msg) {
		System.out.println(msg);
		return sc.next();
	}
	
	/*���뷽������index����*/
	String input(int index) {
		System.out.println(allMsg[index]);
		return sc.next();
	}
	
	
	/*���뷽������index����*/
	Double input1(int index) {
		System.out.println(allMsg[index]);
		return sc.nextDouble();
	}
	
	/*�������*/
	void output(int index) {
		System.out.println(allNotice[index] + "!!!!");
	}
	
	/*���Ҷ���ķ����������˺Ų���*/
	boolean findUser(String acc) {
		if (DataCenter.allUser.containsKey(acc)) {
			return true;//�ҵ��˶���
		}
		return false;//δ�ҵ�����
	}
}
