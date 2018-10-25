package com.Practice.Ch7.Day4.ATM;

public interface BackDelegate {
	public void setDelegate();//先决条件
	
	public void back();//执行行为
}