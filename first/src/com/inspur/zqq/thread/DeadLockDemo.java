package com.inspur.zqq.thread;

public class DeadLockDemo {
	private static Object lockA = new Object();
	private static Object lockB = new Object();
	public static void main(String[] args) {
		//����ʹ��lambda���ʽ����һ���߳�
		//�߳�  1
		new Thread(() -> {
			synchronized (lockA) {
				try {
				//���߳�����һ�ᣬȷ������һ���߳̿��Ի�ȡ��B��	
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
			System.out.println("����...");
			synchronized (lockA) {
				
			}
			}
		
	}).start();
}
}
