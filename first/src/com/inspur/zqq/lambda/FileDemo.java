package com.inspur.zqq.lambda;

import java.io.File;
import java.io.IOException;

public class  FileDemo {
    public static void main(String[] args){
        //ͬѧ�ǿ��Ը����Լ���·�����и���
        File f1 =new File("E:\\text\1.txt");
        //File(String parent,String child)
        File f2 =new File("E:\\text","2.txt");
        //separator ��ƽ̨�ָ���
        File f3 =new File("E:\\text"+File.separator+"txt");
        File f4 =new File(f3,"3.txt");

        
          
             System.out.println(f1);
                //���ļ�����ʱ���� false��������ʱ���� true
                try {
					System.out.println(f2.createNewFile());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                //���ļ�������ʱ���� false
                System.out.println(f3.delete());
       

        //�г������µ��ļ����ļ���
        File[] files =File.listRoots();
        for(File file:files){
            System.out.println(file);
            if(file.length()>0){
                String[] filenames =file.list();
                for(String filename:filenames){
                    System.out.println(filename);
                }
            }
        }
    }

}