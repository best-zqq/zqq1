package com.inspur.zqq.thread;

public class ThreadLocalDemo {
	public static void main(String[] args) {
		ThreadDemo thread = new ThreadDemo();
		new Thread(thread).start();
		new Thread(thread).start();
	}
	}
	class  ThreadDemo implements Runnable{
		private static ThreadLocal<Integer> threadlocal = 
				ThreadLocal.withInitial(() -> 0);
			public void run() {
				for(int i=0;i<10;i++) {
					Integer integer = threadlocal.get();
					integer++;
					threadlocal.set(integer);
					System.out.println(integer);
				}	
			}
	}

