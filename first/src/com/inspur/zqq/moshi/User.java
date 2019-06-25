package com.inspur.zqq.moshi;

public abstract class User {
	protected AbstractChatRoom chatRoom;
	public User(AbstractChatRoom chatRoom) {
		this.chatRoom =  chatRoom;
	}
	/**
	 * ·¢ËÍÏûÏ¢
	 */
	public abstract void sendMessage(String msg);
	public abstract void getMessage(String msg);
}
