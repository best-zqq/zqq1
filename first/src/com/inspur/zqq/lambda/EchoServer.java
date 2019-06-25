package com.inspur.zqq.lambda;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		try {
			//服务端需要使用ServerSocket类
			ServerSocket serverSocket = new ServerSocket(1080);
			//阻塞 等待客户端连接
			Socket client = serverSocket.accept();
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String userIn;
			while((userIn=in.readLine())!=null) {
				System.out.println("收到客户端消息："+userIn);
				out.println(userIn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
