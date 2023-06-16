package com.java.class01.thread.lang;

public class Thread {
	private Runnable runnable;
	private String name;
	
	public Thread(Runnable runnable) {
		this.runnable = runnable;
	}
	
	public void start() {
		if(runnable != null) {
			runnable.run();
		}else {
			this.run();
		}
	}
	
	public void run() {
		System.out.println("Thread run()");
	}
	
	public String getName(){
		String name=null;
		if(runnable != null) {
			name = runnable.getName();
		}else {
			name = this.name;
		}
		return name;
	}
	
	public void setName(String name){
		if(runnable != null) {
			runnable.setName(name);
		}else {
			this.name = name;
		}
	}
}
