package com.java.class01.thread.lang;

public class ThreadSimulator {
	
	public static void main(String[] args) {
		//System.out.println("Thread - " + Thread.currentThread().getName()) ;
		
		Thread aThread = new ThreadA();
		Thread bThread = new ThreadA();
		aThread.setName("aThread");
		bThread.setName("bThread");
		System.out.println("main - 11 line");
		aThread.start();
		bThread.start();
		System.out.println("main - 13 line");
		System.out.println("main - End");
		
		Runnable runnableA = new RunnableA();
		Thread threadRunA = new Thread(runnableA);
		threadRunA.setName("thRunnableA");
		threadRunA.start();
		
	}
	
}
