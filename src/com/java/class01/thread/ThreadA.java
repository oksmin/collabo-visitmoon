package com.java.class01.thread;

public class ThreadA extends Thread{
	@Override
	public void run() {
		// thread
		int endFlag = 10;
		
		for(int i=0 ; i < endFlag ; i++) {
			System.out.println("Thread "+ i +" - " + Thread.currentThread().getName()) ;
		}
		
		
	}
}
