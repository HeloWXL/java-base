package com.ustcinfo.wangxianlin.thread;

/**
* @Description: 同步方法方式
* @params: 
* @return: 
* @Author: wangxianlin
* @Date: 2020/6/24 4:49 PM
*/ 
public class TicketSellByRunable3 implements Runnable{
    //定义一共有 50 张票，注意声明为 static,表示几个窗口共享
    public int num = 50;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            sell();
        }
    }


    public synchronized void sell(){
        if (num > 0) {
            //让线程休息一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //打印余票数量
            System.out.println(Thread.currentThread().getName() + "卖出一张票,剩余" + (--num) + "票");
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
