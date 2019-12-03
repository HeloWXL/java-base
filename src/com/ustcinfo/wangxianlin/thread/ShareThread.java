package com.ustcinfo.wangxianlin.thread;

/**
 * @Classname ShareThread
 * @Description TODO 共享数据 --数据不一致
 * @Date 2019/12/3 9:23 下午
 * @Created by wangxianlin
 */
public class ShareThread {
    static int data = 0;

    private static class ShareThead1 implements Runnable{
        @Override
        public void run() {
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

    private static class ShareThead2 implements Runnable{
        @Override
        public void run() {
            while (data<100){
                data++;
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
