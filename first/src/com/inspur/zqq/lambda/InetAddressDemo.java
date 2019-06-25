package com.inspur.zqq.lambda;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
        	InetAddress baidu = InetAddress.getByName("www.shiyanlou.com");
        	System.out.println(baidu.toString());
        	String ip = baidu.toString().split("/")[1];
            //根据IP地址获取主机名
            InetAddress byAddress = InetAddress.getByName(ip);
            System.out.println("get hostname by IP address:" + baidu.getHostName());
            System.out.println("localhost: "+baidu.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}