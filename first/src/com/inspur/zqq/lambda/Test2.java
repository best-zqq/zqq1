package com.inspur.zqq.lambda;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * �ڼ����϶���д���ַ�Ȼ���������Ļ��
 * @author zqq
 *
 */
public class Test2 {
	public void copy(InputStream in,OutputStream out) throws IOException {
		byte[] buf = new byte[4096];
		int len = in.read(buf);
		while(len!=-1) {
			out.write(buf);
			len = in.read(buf);
		}
		
	}
	public static void main(String[] args) throws IOException {
		Test2 t =new Test2();
		System.out.println("�����ַ���");
		t.copy(System.in, System.out);
		
		
	}
}
