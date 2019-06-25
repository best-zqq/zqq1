package com.inspur.zqq.thread;

public class forCharacter2 {
	private static char c = 'A';
	private static int i = 0;
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (this) {
					try {
						int threadId = Integer.parseInt(Thread.currentThread().getName());
						
						while(i<26) {
							if(i%3==threadId-1) {
								System.out.println("Ïß³Ìid:"+threadId+" "+(char)c++);
								i++;
								if(i==26)
									System.out.println("OK");
								notifyAll();
							}else {
								wait();
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1 = new Thread(r,"1");
		Thread t2 = new Thread(r,"2");
		Thread t3 = new Thread(r,"3");
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
