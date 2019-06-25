package com.inspur.zqq.zerenlian;

public class FactoryManagerHandler extends Handler{
	@Override
	public void handlerRequest(int heaven) {
		// TODO Auto-generated method stub
		if(heaven<=7) {
			System.out.println("厂长处理");
		}
		else {
			if(successor!=null) {
				super.successor.handlerRequest(heaven);
			}
		}
	}
}
