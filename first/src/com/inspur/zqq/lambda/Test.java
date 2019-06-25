package com.inspur.zqq.lambda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		try {
		File inFile  = new File("E:\\text\\2.txt");
		File outFile = new File("E:\\text\\file2.txt");
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos = new FileOutputStream(outFile);
		int c;
		while((c=fis.read())!=-1) {
				fos.write(c);
			}
		fis.close();
		fos.close();}
		 catch(FileNotFoundException e) {
			 System.out.println("FileStreamTest:"+e);
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

