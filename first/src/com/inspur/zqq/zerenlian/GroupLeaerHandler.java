package com.inspur.zqq.zerenlian;

public class GroupLeaerHandler extends Handler{
	public void handlerRequest(int heaven)
{
		if(heaven<=2) {
			System.out.println("�鳤����");
		}
		else {
			if(super.successor!=null) {
				super.successor.handlerRequest(heaven);
			}
		}
}}
