package com.inspur.zqq.thread;

public class forCharacter {
	private static char c ='A';
	private static int i=0;
	public static void main(String[] args) {
		Runnable r =new Runnable() {
			public void run() {
				int threadId = Integer.parseInt(Thread.currentThread().getName());
				while(i<26) {
					if(i%3==threadId-1) {
						System.out.println("Ïß³Ìid£º"+threadId+""+(char)c++);
						i++;
						if(i==26)
							System.out.println("½áÊø");
					}
					try {
						Thread.sleep(1000);
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
