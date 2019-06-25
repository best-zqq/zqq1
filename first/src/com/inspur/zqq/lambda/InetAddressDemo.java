package com.inspur.zqq.lambda;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
        	InetAddress baidu = InetAddress.getByName("www.shiyanlou.com");
        	System.out.println(baidu.toString());
        	String ip = baidu.toString().split("/")[1];
            //����IP��ַ��ȡ������
            InetAddress byAddress = InetAddress.getByName(ip);
            System.out.println("get hostname by IP address:" + baidu.getHostName());
            System.out.println("localhost: "+baidu.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}