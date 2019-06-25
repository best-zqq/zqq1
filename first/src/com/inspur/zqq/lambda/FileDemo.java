package com.inspur.zqq.lambda;

import java.io.File;
import java.io.IOException;

public class  FileDemo {
    public static void main(String[] args){
        //同学们可以根据自己的路径进行更改
        File f1 =new File("E:\\text\1.txt");
        //File(String parent,String child)
        File f2 =new File("E:\\text","2.txt");
        //separator 跨平台分隔符
        File f3 =new File("E:\\text"+File.separator+"txt");
        File f4 =new File(f3,"3.txt");

        
          
             System.out.println(f1);
                //当文件存在时返回 false；不存在时返回 true
                try {
					System.out.println(f2.createNewFile());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                //当文件不存在时返回 false
                System.out.println(f3.delete());
       

        //列出磁盘下的文件和文件夹
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