package com.java.class02.thread;

public class ThreadA extends Thread{
	private Score score;
	private final int index;
	
	public ThreadA(Score score, int index, String name) {
		this.score = score;
		this.index = index;
		this.setName(name);
		this.score.setUserName(index, name);
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<10 ; i++) {
			
			System.out.println( getName() + " - " + i );
			
			if( !this.score.isBothTrue(this.index) ) {
			
				System.out.println( getName() + " - " + i);
				this.score.setRSP(this.index, (int) Math.floor(Math.random() * 3 ) );
				this.score.setIsBothTrue(this.index);
				
			}else {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(getName() + " shouldStop");
		this.score.shouldStop(this.index);
	}
	
	
	
}
