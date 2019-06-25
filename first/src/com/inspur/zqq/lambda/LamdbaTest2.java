package com.inspur.zqq.lambda;

class qiqi{
	public static String saysay() {
		String abc = "ÕÅç÷ç÷ÄãºÃ°ô°¡";
		return abc;
	}
} 
public class LamdbaTest2 {
	final static String salutation = "Hello";
	static String salutation2 = "Hello";
	String salution1= "hello";
	final String salution2 ="hello";
	
	public static void main(String[] args) {
		String salutation3 = "hello";
		GreetingService greet = message->System.out.println(salutation+message);
		greet.sayMessage(qiqi.saysay());
		
	}
	interface GreetingService{
		void sayMessage(String message);
	}
	
	}
