package com.inspur.zqq.thread;

public class SynchronizedDemo {
	private static Object lock = new Object();
	public static void main(String[] args) {
		//ͬ�������  ��סlock
		synchronized (lock) {
			//do sonmething
		}
	}
	//��̬ͬ������  ��ס��ǰ��class����
	public synchronized static void staticMethod() {
		
	}
	//��ͨͬ������ ��ס��ǰʵ������
	public synchronized void memberMethod() {
		
	}
}
