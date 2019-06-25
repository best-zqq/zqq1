package com.inspur.zqq.zerenlian;

public class Client {
	public static void main(String[] args) {
		Handler groupLeaderHandler = new GroupLeaerHandler();
		Handler factoryManagerHandler = new FactoryManagerHandler();
		Handler bossHandler = new BossHandler();
		groupLeaderHandler.setSuccessor(factoryManagerHandler);
		factoryManagerHandler.setSuccessor(bossHandler);
		groupLeaderHandler.handlerRequest(1);
		groupLeaderHandler.handlerRequest(6);
		groupLeaderHandler.handlerRequest(10);
	}
}
