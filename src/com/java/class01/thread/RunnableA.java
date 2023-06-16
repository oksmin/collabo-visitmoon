package com.java.class01.thread;

public class RunnableA implements Runnable{

	@Override
	public void run() {
		int endFlag = 10;
		
		for(int i=0 ; i < endFlag ; i++) {
			System.out.println("Thread "+ i +" - " + Thread.currentThread().getName()) ;
		}
	}

}
