package com.inspur.zqq.lambda;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("a.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		try {
			dos.writeBoolean(true);
			dos.writeByte((byte)123);
			dos.writeChar('J');
			dos.writeDouble(2.1434232);
			dos.writeFloat(2.122f);
			dos.writeInt(123);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dos.close();
		}
		FileInputStream fis = new FileInputStream("a.txt");
		DataInputStream dis = new DataInputStream(fis);
		try {
			System.out.println("\t"+dis.readBoolean());
			System.out.println("\t"+dis.readByte());
			System.out.println("\t"+dis.readChar());
			System.out.println("\t"+dis.readDouble());
			System.out.println("\t"+dis.readFloat());
			System.out.println("\t"+dis.readInt());
		}finally {
			dis.close();
		}
	
	}
}
