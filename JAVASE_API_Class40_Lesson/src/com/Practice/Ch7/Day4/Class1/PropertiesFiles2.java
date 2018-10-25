package com.Practice.Ch7.Day4.Class1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFiles2 {

	public static void main(String[] args) {
		Properties myProperties = new Properties();
		myProperties.setProperty("name", "M33olly");
		myProperties.setProperty("age", "44werr");
		myProperties.setProperty("iuuud", "2werwe9");
		String myPath = "src\\config.properties";
		try {
			myProperties.load(new FileReader(myPath));
			myProperties.store(new FileWriter(myPath), "userInfo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
