package com.inspur.zqq.lambda;

import java.io.File;

public class ReadDir {
	public static void main(String[] args) {
//		File[] files = File.listRoots();
//		for(File file:files) {
//			System.out.println(file);
//			if(file.length()>0) {
//				String[] filenames = file.list();
//				for(String filename:filenames)
//					System.out.println(filename);
//			}
//		}
		readDir(new File("E:\\tmp"));
	}
	 static void readDir(File file) {
	        if (file == null) {
	            return;
	        }
	        //�����ǰfile��Ŀ¼
	        if (file.isDirectory()) {
	            File[] files;
	            //���Ŀ¼��Ϊ��
	            if ((files = file.listFiles()) != null) {
	                for (File file1 : files) {
	                    //�ݹ��ȡĿ¼����
	                    readDir(file1);
	                }
	            }
	        } else {
	            //�������Ŀ¼ ֱ������ļ���
	            System.out.println(file.getName());
	        }
	    }
	}
