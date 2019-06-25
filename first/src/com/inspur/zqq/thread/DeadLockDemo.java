package com.inspur.zqq.thread;

public class DeadLockDemo {
	private static Object lockA = new Object();
	private static Object lockB = new Object();
	public static void main(String[] args) {
		//这里使用lambda表达式创建一个线程
		//线程  1
		new Thread(() -> {
			synchronized (lockA) {
				try {
				//让线程休眠一会，确认另外一个线程可以获取到B锁	
					Thread.sleep(5000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("D");
				synchronized (lockB) {	
				}
				
			}
		}).start();
		new Thread(() -> {
			synchronized (lockB) {
			System.out.println("死锁...");
			synchronized (lockA) {
				
			}
			}
		
	}).start();
}
}
