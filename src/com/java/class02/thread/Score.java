package com.java.class02.thread;

import java.util.HashMap;
import java.util.Map;

public class Score extends Thread{
	
	private int[] rsp = null;
	private boolean[] isBothTrue = null;
	private boolean[] shouldStop = null;
	private Map<Integer, String> mapperRSP = null;
	private Map<Integer, String> mapperUser = null;
	
	public Score(int numOfUser) {
		rsp = new int[numOfUser];
		isBothTrue = new boolean[numOfUser];
		shouldStop = new boolean[numOfUser];
		mapperRSP = new HashMap<>();
		mapperUser = new HashMap<>();
		
		initMapper();
	}
	
	public void setUserName(int index, String user) {
		mapperUser.put( index , user);
	}
	
	private void initMapper() {
		mapperRSP.put(0, "가위");
		mapperRSP.put(1, "바위");
		mapperRSP.put(2, "보");
		mapperRSP.put(3, "가위");
	}

	@Override
	public void run() {
		
		System.out.println("게임을 시작합니다.");
		
		while( !shouldStop() ) {
			// flag true
			// -> 1. 계산 2. false
			while(  isBothTrue[0] || isBothTrue[1]  ) {
				
				//System.out.println(shouldStop[0] +" vs " + shouldStop[1] );
				if( isBothTrue() ) {
					
					/*가위 0 바위 1 보 2, 3 && 2 
					  => total = user1 - user2 */
					if( rsp[0]==0 && rsp[1]==2 ){
						rsp[0] = 3;
					}
					int result = rsp[0] - rsp[1];
					String user1 = mapperUser.get(0);
					String user2 = mapperUser.get(1);
					String msg = user1 + " vs " +  user2 +"\n"
									+ mapperRSP.get(rsp[0]) + " vs " + mapperRSP.get(rsp[1]) +"\n"
							;
					
					
					if( result > 0) {
						// win rsp[0]
						msg += "RESULT : " + user1   + "wins !!!";
						
					}else if(result < 0 ) {
						// win rsp [1]
						msg += "RESULT : " + user2   + "wins !!!";
					}else {
						// win rsp[0]
						msg += "RESULT : " + user1   + "wins !!!";
					}
					System.out.println(msg);
					// 초기화
					rsp[0] = 0;
					rsp[1] = 0;
					isBothTrue[0] = false;
					isBothTrue[1] = false;
					try {
						Thread.yield();
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			try {
				System.out.println("대기중");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("게임을 마쳤습니다.");
	}
	
	public boolean isBothTrue() {
		return isBothTrue[0] && isBothTrue[1];
	}

	private boolean shouldStop() {
		return shouldStop[0]== true 
				&& shouldStop[1] == true;
	}
	
	public void shouldStop(int index) {
		shouldStop[index] = true;
	}
	
	public void setIsBothTrue(int index) {
		System.out.println("setIsBothTrue - " + index);
		isBothTrue[index] = true;
	}
	
	public boolean isBothTrue(int index) {
		return isBothTrue[index];
	}
	
	public void setRSP(int index, int value) {
		rsp[index] = value;
	}
	
}
