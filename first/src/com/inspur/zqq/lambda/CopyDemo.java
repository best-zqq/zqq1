package com.inspur.zqq.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyDemo {
    public static void main(String[] args) {
		
//		 try { //���������ļ�һ��Ҫ���� ������׳��쳣 �����1.txtһ��Ҫ����
//		  Files.copy(Paths.get("E:\\text\\2.txt"),
//		 Paths.get("E:\\text\\1.txt"),StandardCopyOption.REPLACE_EXISTING); } catch
//		 (IOException e) { e.printStackTrace(); }
		 
    	try {
            //��1.txt ������Ϊ3.txt ���ֻ��Ҫ�ƶ�����ͬ��Ŀ¼���ļ������伴��
            Files.move(Paths.get("E:\\text\\2.txt"), Paths.get("E:\\1.txt"), StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}