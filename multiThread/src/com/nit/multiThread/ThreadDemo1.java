package com.nit.multiThread;

public class ThreadDemo1 {
	public static void main(String[] args) throws InterruptedException {
			Thread t1 = new Thread(()->{
				for(int i=1;i<5;i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			Thread t2 = new Thread(()->{
				for(char i ='A';i<='E';i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
	    t1.start();
	    Thread.sleep(100);
	    t2.start();
		}

	}
