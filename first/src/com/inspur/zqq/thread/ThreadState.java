package com.inspur.zqq.thread;

public class ThreadState implements Runnable{
	public synchronized void waitForAmoment() throws InterruptedException {
		wait(500);
	}
	public synchronized void waitForever() throws InterruptedException {
		wait();
	}
	public synchronized void notifyNow() {
		notify();
	}
	public void run() {
		
		try {
			waitForAmoment();
			waitForever();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
