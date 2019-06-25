package com.inspur.zqq.lambda;

public class LamdbaTest {
  public static void main(String[] args) {
	LamdbaTest tester = new LamdbaTest();
	MathOperation addition = (int a,int b)->a+b;
	MathOperation substraction =(a,b)->a-b;
	MathOperation multiplication =(int a,int b)->{return a*b;};
	MathOperation division = (int a,int b)->a/b;
	System.out.println("10+5="+tester.operation(10,5,addition));
	System.out.println("10-5="+tester.operation(10, 5, substraction));
	System.out.println("10*5="+tester.operation(10, 5, multiplication));
	System.out.println("10/5="+tester.operation(10,5, division));
	GreetingService greet = message->System.out.println("Hello"+message);
	GreetingService greet2 = (String message)->System.out.println("Hello"+message);
	greet.sayMessage(" Zhangqiqi");
	greet.sayMessage(" ZHANG DA SHUAI");
  }
  interface MathOperation{
	  int operation(int a,int b);
  }
  interface GreetingService{
	  void sayMessage(String message);
  }
  private int operation(int a,int b,MathOperation mathoperation) {
	  return mathoperation.operation(a, b);
  }
}
