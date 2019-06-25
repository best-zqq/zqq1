package com.inspur.zqq.thread;

public class loack {
	
	public static void main(String[] args) {
		Printabc print1 = new Printabc();
		Printabc print2 = new Printabc();
		Printabc print3 = new Printabc();
		new Thread(print1).start();
		new Thread(print2).start();
		new Thread(print3).start();
		
	}

	class Printabc1 implements Runnable{
		public void run() {
			
			try {
				System.out.println("A");
							System.out.println("B");
				System.out.println("C");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
