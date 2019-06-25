package com.inspur.zqq.lambda;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		try {
			//�������Ҫʹ��ServerSocket��
			ServerSocket serverSocket = new ServerSocket(1080);
			//���� �ȴ��ͻ�������
			Socket client = serverSocket.accept();
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String userIn;
			while((userIn=in.readLine())!=null) {
				System.out.println("�յ��ͻ�����Ϣ��"+userIn);
				out.println(userIn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
