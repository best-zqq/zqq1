package com.inspur.zqq.thread;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class PcModel {
    //��������
    private static LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        //������
        Thread provider = new Thread(() -> {
            Random random = new Random();
            for (int j = 0; j < 5; j++) {
                try {
                    int i = random.nextInt();
                    //ע��ֱ����������
                    queue.put(i);
                    System.out.println("�������ݣ�" + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //������
        Thread consumer = new Thread(() -> {
            Integer data;
            for (int i = 0; i < 5; i++) {
                try {
                    //����ֱ��ȡ������
                    data = queue.take();
                    System.out.println("�������ݣ�" + data);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //�����߳�
        provider.start();
        consumer.start();
    }
}