package com.inspur.zqq.lambda;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) {
		String hostname = "127.0.0.1";
		//socket�˿�
		int port = 1080;
		Scanner userIn = new Scanner(System.in);
		try {
			//����socket����
			Socket socket = new Socket(hostname,port);
			//��ȡsocket�����
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			//��ȡ������
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String userInput;
			System.out.println("��������Ϣ��");
			//���û�����exitʱ�˳�
			while(!"exit".equals(userInput=userIn.nextLine()))
			{
				out.println(userInput);
				System.out.println("�յ�����˻�Ӧ��"+in.readLine());
				
			}
			socket.close();
			} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
