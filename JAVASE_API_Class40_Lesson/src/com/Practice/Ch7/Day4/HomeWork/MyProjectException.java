package com.Practice.Ch7.Day4.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class MyProjectException extends Exception {
	static Map<Integer, String> codeMap = new HashMap<Integer,String>();
	int errorCode;
	
	static {
		codeMap.put(101, "用户余额不足");
	}
	public MyProjectException(int code){
		super(codeMap.get(code));
		this.errorCode = code;
	}
	/**
	 * 101 用户余额不足
	 */
	private static final long serialVersionUID = 1L;
	
}
