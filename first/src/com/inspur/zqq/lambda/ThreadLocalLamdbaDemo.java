package com.inspur.zqq.lambda;

public class ThreadLocalLamdbaDemo {

    /**
     * �������
     *
     * @param args ���в���
     */
    public static void main(String[] args) {
       // safeDeposit();
        System.out.println("------------------------------");
        notSafeDeposit();
        //notSafeDeposit();
    }

    /**
     * �̰߳�ȫ�Ĵ��
     */
    private static void safeDeposit() {
        SafeBank bank = new SafeBank();
        Thread thread1 = new Thread(() -> bank.deposit(125),"ss");
        Thread thread2 = new Thread(() -> bank.deposit(200), "����");
        Thread thread3 = new Thread(() -> bank.deposit(500), "����");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    /**
     * ���̰߳�ȫ�Ĵ��
     */
    private static void notSafeDeposit() {
        NotSafeBank bank = new NotSafeBank();
        Thread thread1 = new Thread(() -> bank.deposit(200), "�ų���");
        Thread thread2 = new Thread(() -> bank.deposit(200), "����");
        Thread thread3 = new Thread(() -> bank.deposit(500), "����");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

/**
 * ���̰߳�ȫ������
 */
class NotSafeBank {

    /**
     * ��ǰ���
     */
    private int balance = 1000;

    /**
     * ���
     *
     * @param money �����
     */
    public void deposit(int money) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " -> ��ǰ�˻����Ϊ��" + this.balance);
        this.balance += money;
        System.out.println(threadName + " -> ���� " + money + " �󣬵�ǰ�˻����Ϊ��" + this.balance);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * �̰߳�ȫ������
 */
class SafeBank {

    /**
     * ��ǰ���
     */
    private ThreadLocal<Integer> balance = ThreadLocal.withInitial(() -> 1000);

    /**
     * ���
     *
     * @param money �����
     */
    public void deposit(int money) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " -> ��ǰ�˻����Ϊ��" + this.balance.get());
        this.balance.set(this.balance.get() + money);
        System.out.println(threadName + " -> ���� " + money + " �󣬵�ǰ�˻����Ϊ��" + this.balance.get());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

