package com.inspur.zqq.thread;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	private static ReentrantLock lock = new ReentrantLock();
	public static void main(String[] args) {
		Thread thread1 = new Thread(()-> {
			lock.lock();
			try {
				//��Ҫͬ���Ĵ����
				System.out.println("�߳�1����");
			}finally {
				//һ��Ҫ��finally�н����������������
				lock.unlock();
				System.out.println("�߳�1����");
			}
		});
		thread1.start();
		Thread thread2 = new Thread(() ->  {
			lock.lock();
			try {
				//Ҫͬ���Ĵ����
				System.out.println("�߳�2����");
			}finally {
			System.out.println("�߳�2����");
			}
		});
		thread2.start();
	}
}
