package com.inspur.zqq.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyDemo {
    public static void main(String[] args) {
		
//		 try { //被拷贝的文件一定要存在 否则会抛出异常 这里的1.txt一定要存在
//		  Files.copy(Paths.get("E:\\text\\2.txt"),
//		 Paths.get("E:\\text\\1.txt"),StandardCopyOption.REPLACE_EXISTING); } catch
//		 (IOException e) { e.printStackTrace(); }
		 
    	try {
            //将1.txt 重命名为3.txt 如果只需要移动到不同的目录，文件名不变即可
            Files.move(Paths.get("E:\\text\\2.txt"), Paths.get("E:\\1.txt"), StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}