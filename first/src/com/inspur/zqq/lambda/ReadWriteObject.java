package com.inspur.zqq.lambda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ReadWriteObject {
	public static void main(String[] args) {
		File file = new File("E:\\text\\user.file");
		try {
			ObjectOutputStream objos = new ObjectOutputStream(new FileOutputStream(file));
			objos.writeObject(new User("zqq","zqqpwd"));
			objos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				ObjectInputStream objis = new ObjectInputStream(new FileInputStream(file));
				User user = (User)objis.readObject();
				System.out.println(user.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	static class User implements Serializable{
		private String username;
		private String password;
		public User(String username,String password) {
			this.username = username;
			this.password = password;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "User{"+
					"username='"+username+'\''+",password='"+password+'\''+'}';
		}
	}
}
