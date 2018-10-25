package com.Practice.Ch7.Day4.ATM;
import java.util.Scanner;

public class Tools {
	static private Scanner sc = new Scanner(System.in);
	private String [] allMsg = {
			"�����������˺ţ�",
			"�������������룺",
			"����������ѡ�",
			"����������ѡ�1.��Ǯ  2.ȡǮ",
			"���������Ľ�"
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
	
	/*�������*/
	void output(int index) {
		System.out.println(allNotice[index] + "!!!!");
	}
	
	/*���Ҷ���ķ����������˺Ų���*/
	int findUser(String acc) {
		for (int i=0;i<DataCenter.userCount;i++) {
			if (DataCenter.allUser[i] != null &&
				DataCenter.allUser[i].getAcc().equals(acc)) {//��·��&&ǰ��Ϊ�٣��󷽲�ִ��
				return i;//�ҵ��˶���
			}
		}
		return -1;//δ�ҵ�����
	}
}
