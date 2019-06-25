package com.inspur.zqq.thread;

import java.util.concurrent.ArrayBlockingQueue;

public class ABQDemo {
	private static ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10);
	public static void main(String[] args) {
		Thread thread1 = new Thread(() ->{
			for(int i=1;i<=10;i++) {
				arrayBlockingQueue.add(i);
			}
		});
		thread1.start();
		try {
			//�ȴ��߳�1ִ�����
			thread1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Thread(() ->{
			if(!arrayBlockingQueue.offer(11)) {
				System.out.println("����Ԫ��11ʧ��");
			}
			try {
				//һֱ����ֱ������Ԫ��11�����������Ĳ������̣߳�main�������Ǽ���ִ��
				arrayBlockingQueue.put(11);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}).start();
		Thread thread2 = new Thread(() ->{
			Integer element;
			System.out.println("��ʼ���ӣ�");
			while((element = arrayBlockingQueue.poll())!=null) {
			System.out.println("\t"+element);
			}
		});
		thread2.start();
	}
}
