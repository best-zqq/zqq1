package com.inspur.zqq.moshi;

public class UserB extends User{
	public UserB(AbstractChatRoom chatroom) {
		super(chatroom);
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("�û�B����"+msg);
		chatRoom.notice(msg, this);
		
	}

	@Override
	public void getMessage(String msg) {
		System.out.println("�û�B�յ���"+msg);
		
	}
}
