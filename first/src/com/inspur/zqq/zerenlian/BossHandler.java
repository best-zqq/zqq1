package com.inspur.zqq.zerenlian;

public class BossHandler extends Handler{
	@Override
	public void handlerRequest(int heaven) {
		// TODO Auto-generated method stub
		if(heaven<=15) {
			System.out.println("ÀÏ°å´¦Àí");
		}
		else {
			if(super.successor!=null) {
				super.successor.handlerRequest(heaven);
			}
		}
	}
}
