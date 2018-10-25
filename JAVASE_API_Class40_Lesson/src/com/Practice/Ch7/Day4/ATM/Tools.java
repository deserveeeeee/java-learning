package com.Practice.Ch7.Day4.ATM;
import java.util.Scanner;

public class Tools {
	static private Scanner sc = new Scanner(System.in);
	private String [] allMsg = {
			"请输入您的账号：",
			"请输入您的密码：",
			"请输入您的选项：",
			"请输入您的选项：1.存钱  2.取钱",
			"请输入您的金额："
	};
	
	private String [] allNotice = {
			"登录成功",
			"登录失败，密码不正确",
			"登录失败，您的账号不存在",
			"注册失败，您的账号已存在",
			"注册成功"
	};
	
	/*输入方法，不带参*/
	String input() {
		return sc.next();
	}
	
	/*输入方法，带msg参数*/
	String input(String msg) {
		System.out.println(msg);
		return sc.next();
	}
	
	/*输入方法，带index参数*/
	String input(int index) {
		System.out.println(allMsg[index]);
		return sc.next();
	}
	
	/*输出方法*/
	void output(int index) {
		System.out.println(allNotice[index] + "!!!!");
	}
	
	/*查找对象的方法，根据账号查找*/
	int findUser(String acc) {
		for (int i=0;i<DataCenter.userCount;i++) {
			if (DataCenter.allUser[i] != null &&
				DataCenter.allUser[i].getAcc().equals(acc)) {//短路，&&前方为假，后方不执行
				return i;//找到了对象
			}
		}
		return -1;//未找到对象
	}
}
