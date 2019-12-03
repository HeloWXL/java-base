package com.ustcinfo.wangxianlin.thread;

/**
 * @Classname ShareThead1
 * @Description TODO 共享数据+锁
 * @Date 2019/12/3 9:32 下午
 * @Created by wangxianlin
 */
public class ShareTheadSecond {
    //定义一个锁对象lock
    static final Object lock = new Object();
    static int data = 0;

    private static class ShareThead1 implements Runnable{
        @Override
        public void run() {
            synchronized (lock){
                while (data<10){
                    try {
                        Thread.sleep(1000);
                        System.out.println("这个小于10的数据是："+data++);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static class ShareThead2 implements Runnable{
        @Override
        public void run() {
            synchronized (lock) {
                while (data<100){
                    data++;
                }
                System.out.println("ShareThread2执行完后的值为："+data);
            }
        }
    }

    public static void main(String[] args) {
        ShareThead1 shareThead1 = new ShareThead1();
        ShareThead2 shareThead2 = new ShareThead2();
        new Thread(shareThead1).start();
        new Thread(shareThead2).start();
    }
}
