package com.inspur.zqq.lambda;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Scanner;

public class NioDemo {
	public static void main(String[] args) {
		try {
			File file = new File("E:\\text\123.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			//����channel nioͨ��channel�������ļ����൱������
			FileChannel writeChannel = new RandomAccessFile(file, "rw").getChannel();
			//����һ��ByteBuffer����Ϊ100
			ByteBuffer byteBuffer = ByteBuffer.allocate(100);
			System.out.println("�������ַ���");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			//���ַ���д�뵽������
			byteBuffer.put(s.getBytes());
			System.out.println("д�����ݺ�ָ��仯-postition��"+
			byteBuffer.position()+" limit:"+byteBuffer.limit()+ "capacity:"+
					byteBuffer.capacity());
			//Ϊ���������׼�� ��limit�ƶ���positionλ�ã�position��0
			byteBuffer.flip();
			System.out.println("flip��ָ��仯-postition��"+
					byteBuffer.position()+" limit:"+byteBuffer.limit()+ "capacity:"+
							byteBuffer.capacity());
			//��������д��channel
			writeChannel.write(byteBuffer);
			//��������� Ϊ�´�д����߶�ȡ������׼�� �ָ�����ʼ״̬ 
			//position=0 limit=capacity=100  ��Ϊ������������������СΪ100
			byteBuffer.clear();
			System.out.println("clear��ָ��仯-postition��"+
					byteBuffer.position()+" limit:"+byteBuffer.limit()+ "capacity:"+
							byteBuffer.capacity());
			//�ر�channel
			writeChannel.close();
			FileChannel readChannel = new RandomAccessFile(file, "r").getChannel();
			//��channel�н����ݶ�ȡ��������
			while(readChannel.read(byteBuffer)!=-1) {
				//Ϊ��ȡ����׼��
				byteBuffer.flip();
				//������� ���ñ�����
				Charset charset = Charset.forName("UTF-8");
				CharsetDecoder decoder = charset.newDecoder();
				System.out.println("��ȡ�����"+decoder.decode(byteBuffer));
				//���������
				byteBuffer.clear();
			}
			readChannel.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
	}
}
