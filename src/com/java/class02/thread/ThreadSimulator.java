package com.java.class02.thread;

public class ThreadSimulator {

	public static void main(String[] args) throws InterruptedException {
		
		
		int numOfUser = 2;
		Score score = new Score(numOfUser);
		Thread threadA = new ThreadA(score, 0, "threadA");
		Thread threadB = new ThreadA(score, 1, "threadB");
		
		score.start();
		Thread.sleep(500);
		
		threadA.start();
		Thread.sleep(500);
		threadB.start();
		
		
		
		
		
		
		
	}

}
