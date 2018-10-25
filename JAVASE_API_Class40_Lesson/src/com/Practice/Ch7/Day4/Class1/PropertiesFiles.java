package com.Practice.Ch7.Day4.Class1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFiles {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream(new File("config.properties"));
			Properties myProperties = new Properties();
			myProperties.setProperty("name", "Molly");
			myProperties.setProperty("age", "23");
			myProperties.setProperty("ID", "20180101");
			myProperties.store(fos, "UserInfo");
			fos.close();
			System.out.println(myProperties.getProperty("age"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
