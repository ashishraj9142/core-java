package com.nit.multiThread;


public class ThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		t1.join();
		System.out.println("Main Thread is finished");

	}

}
class MyRunnable implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(7*i);
		}
	}
}
