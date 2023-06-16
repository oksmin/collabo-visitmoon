package com.java.class01.thread.lang;

public class RunnableA implements Runnable{
	private String name ;
	
	@Override
	public void run() {
		int endFlag = 10;
		
		for(int i=0 ; i < endFlag ; i++) {
			System.out.println("Thread "+ i +" - " + this.getName()) ;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
