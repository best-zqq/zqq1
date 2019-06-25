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
			//等待线程1执行完毕
			thread1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Thread(() ->{
			if(!arrayBlockingQueue.offer(11)) {
				System.out.println("插入元素11失败");
			}
			try {
				//一直阻塞直到插入元素11，这里阻塞的不是主线程，main方法还是继续执行
				arrayBlockingQueue.put(11);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}).start();
		Thread thread2 = new Thread(() ->{
			Integer element;
			System.out.println("开始出队：");
			while((element = arrayBlockingQueue.poll())!=null) {
			System.out.println("\t"+element);
			}
		});
		thread2.start();
	}
}
