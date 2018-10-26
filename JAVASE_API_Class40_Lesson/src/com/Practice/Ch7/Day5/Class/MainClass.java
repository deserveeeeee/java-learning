package com.Practice.Ch7.Day5.Class;

public class MainClass {

//	线程操作
//	输入等待
//	持续性的任务必须使用线程
//	售票系统
	
	int ticket = 20;  //在某个时刻只会有一个值
	
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
