package com.inspur.zqq.proxy;

public class LouProxy implements LouSubject{
	private LouSubject target;
	public LouProxy() {
		this.target = new LouRealSubject();
	}
	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("�������");
		target.build();
		System.out.println("�ⶥ");
	}
}
