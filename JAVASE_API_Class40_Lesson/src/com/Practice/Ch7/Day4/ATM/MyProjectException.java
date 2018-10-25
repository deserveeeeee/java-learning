package com.Practice.Ch7.Day4.ATM;

import java.util.HashMap;
import java.util.Map;

public class MyProjectException extends Exception {
	static Map<Integer, String> codeMap = new HashMap<Integer,String>();
	int errorCode;
	
	static {
		codeMap.put(101, "�û�����");
		codeMap.put(102, "�û����Ϸ�");
	}
	public MyProjectException(int code){
		super(codeMap.get(code));
		this.errorCode = code;
	}
	/**
	 * 101 �û�����
	 * 102 �û����Ϸ�
	 */
	private static final long serialVersionUID = 1L;
	
}
