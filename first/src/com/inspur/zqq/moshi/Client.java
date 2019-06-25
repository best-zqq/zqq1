package com.inspur.zqq.moshi;

public class Client {
	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoom();
		UserA userA = new UserA(chatRoom);
		UserB userB = new UserB(chatRoom);
		chatRoom.register(userA);
		chatRoom.register(userB);
		userA.sendMessage("how are you");
		userB.sendMessage("i am fine");
		
		
	}
}
