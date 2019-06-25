package com.inspur.zqq.moshi;

public class UserA extends User{
	public UserA(AbstractChatRoom chatRoom) {
		super(chatRoom);
	}
	public void sendMessage(String msg) {
		System.out.println("�û�A����"+msg);
		chatRoom.notice(msg,this);
	}
	@Override
	public void getMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("�û�A�յ�"+msg);
	}
}
