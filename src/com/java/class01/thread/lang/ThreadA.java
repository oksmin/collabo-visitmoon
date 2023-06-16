package com.java.class01.thread.lang;

public class ThreadA extends Thread{

	public ThreadA() {
		super(null);
	}
	
	@Override
	public void run() {
		//super.run();
		int endFlag = 10;
		
		for(int i=0 ; i < endFlag ; i++) {
			System.out.println("Thread "+ i +" - " + this.getName()) ;
		}
		
	}
}
