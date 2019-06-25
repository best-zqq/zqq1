package com.inspur.zqq.zerenlian;

public abstract class Handler {
	
	 /**
	  * 下个处理者
	  */
	 
	public Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	public abstract void handlerRequest(int heaven);
	
}
