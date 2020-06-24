package com.ustcinfo.wangxianlin.thread;

public class TicketSellByThread extends Thread {
    //定义一共有 50 张票，注意声明为 static,表示几个窗口共享
    public static  int num = 50;

    public TicketSellByThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if(num>0){
                //让线程休息一秒
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //打印余票数量
                System.out.println(currentThread().getName()+"卖出一张票,剩余"+(--num)+"票");
            }
        }
    }





    public static void main(String[] args) {
        TicketSellByThread t1 = new TicketSellByThread("窗口A");
        TicketSellByThread t2 = new TicketSellByThread("窗口B");
        TicketSellByThread t3 = new TicketSellByThread("窗口C");

        t1.start();
        t2.start();
        t3.start();
    }
}
