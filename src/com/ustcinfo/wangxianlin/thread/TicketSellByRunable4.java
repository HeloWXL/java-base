package com.ustcinfo.wangxianlin.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketSellByRunable4 implements Runnable {
    //定义一共有 50 张票，注意声明为 static,表示几个窗口共享
    public int num = 50;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            l.lock();
            try {
                if (num > 0) {
                    //让线程休息一秒
                    Thread.sleep(1000);
                    //打印余票数量
                    System.out.println(Thread.currentThread().getName() + "卖出一张票,剩余" + (--num) + "票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                l.unlock();
            }
        }
    }

    public static void main(String[] args) {
        TicketSellByRunable ticketSellByRunable = new TicketSellByRunable();

        Thread t1 = new Thread(ticketSellByRunable, "窗口A");
        Thread t2 = new Thread(ticketSellByRunable, "窗口B");
        Thread t3 = new Thread(ticketSellByRunable, "窗口C");

        t1.start();
        t2.start();
        t3.start();
    }
}
