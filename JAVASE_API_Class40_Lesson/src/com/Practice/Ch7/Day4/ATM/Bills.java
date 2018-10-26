package com.Practice.Ch7.Day4.ATM;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Date;

public class Bills {
//	��ȡ����ˮ
	public void setMoney (UserData user,Double money,int option){
//		option Ϊ 1 �����Ǯ
//		option Ϊ2 ����ȡǮ
		String path = "src\\com\\Practice\\Ch7\\Day4\\ATM\\UserInfo\\" + user.getAcc() + "Bills.properties";
		
		Properties mProperties = new Properties();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		Date date = new Date();// new Date()Ϊ��ȡ��ǰϵͳʱ��
		
		
		if(option == 1){
			mProperties.setProperty(df.format(new Date()),
					df.format(new Date() + "���ɹ����"+ money +"Ԫ\r\n" +
					"��ԭ�����Ϊ:" + user.getMoney() +"\r\n" 
					+"�����ڵ����Ϊ:" + (user.getMoney()+money)));
		}else if(option == 2) {
			df.format(new Date() + "���ɹ�ȡ�" + money +"Ԫ\r\n" +
					"��ԭ�����Ϊ:" + user.getMoney() +"\r\n" 
					+"�����ڵ����Ϊ:" + (user.getMoney()-money));
		}
		
		
		try {
			mProperties.load(new FileReader(path));
			mProperties.store(new FileWriter(path), "userBills");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

//	ת����ˮ
//	public void transMoney (UserData user,Double money,Us)
}


