package com.inspur.zqq.thread;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%^&*{}|~`:.]+"
				+ "@[a-zA-Z0-9._]+$");
		String[] emails = {"84045127dsabjk@qq.com","kjkdsbh@$%^163.com","asdnjknasd"};
		for(String email:emails) {
			Matcher matcher = pattern.matcher(email);
			
			System.out.println(email+"Æ¥Åä½á¹û£º"+matcher.matches());
		}
		
	}
}
