package com.Practice.Ch7.Day5.Class;

public class MainClass {

//	�̲߳���
//	����ȴ�
//	�����Ե��������ʹ���߳�
//	��Ʊϵͳ
	
	int ticket = 20;  //��ĳ��ʱ��ֻ����һ��ֵ
	
	final MainClass rdf = this;
	
	void start(){
		Thread thread = new Thread(new Runnable() {
			public synchronized void run() {
				while(true){
					if (rdf.ticket < 20) {
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(rdf.ticket);
					rdf.ticket --;
					this.notifyAll();
				}
			}
		});
		
		
		while(true){
			if (rdf.ticket > 20) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(rdf.ticket);
			rdf.ticket ++;
		}
	}
			
	
	
}
