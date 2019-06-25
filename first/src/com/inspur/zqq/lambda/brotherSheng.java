package com.inspur.zqq.lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
/**
 * ��Ҫ�����½�3��Ŀ¼��������ο�������
 * @author zqq
 *
 */
public class brotherSheng {

    public static Random random = new Random();
    //���ʱ�ĵݹ鷽��
    public static void listFiles(File f, int depth) {
        if (f.exists()) {
            random.ints().limit(depth).forEach(v -> System.out.print("  "));
            System.out.println(f.getName());
            File[] fs = f.listFiles();
            if (fs != null) {
                Arrays.asList(fs).forEach(v  -> listFiles(v, depth + 1));
            }
        }
    }

    public static void main(String[] args) {
        String location1 = "src\\main\\java";
        String location2 = "src\\test\\java";
        File f1 = new File(location1);
        File f2 = new File(location2);
        try {
        	//�½��ļ���
            System.out.println(f1.mkdirs());
            System.out.println(f2.mkdirs());
            //���ļ�������ļ���
            random.ints().limit(5).forEach(v -> {
                try {
                    new File(location1 + "\\" + v + ".java").createNewFile();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
            random.ints().limit(5).forEach(v -> {
                try {
                    new File(location2 + "\\" + v + ".java").createNewFile();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });

            String location = "src";
            File f = new File(location);
            listFiles(f, 0);
            System.out.println(f.getAbsolutePath());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}