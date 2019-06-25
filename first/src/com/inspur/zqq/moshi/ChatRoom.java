package com.inspur.zqq.moshi;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom extends AbstractChatRoom{
	private List<User> users = new ArrayList<>();
	public void register(User user) {
		users.add(user);
	}
	@Override
	public void notice(String message, User user) {
		// TODO Auto-generated method stub
		for(User u:users) {
			if(u!=user) {
				u.getMessage(message);
			}
		}
	}
}
