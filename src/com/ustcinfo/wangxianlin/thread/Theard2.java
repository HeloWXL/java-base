package com.ustcinfo.wangxianlin.thread;

/**
 * @Classname Theard2
 * @Description TODO 实现Runable接口
 * @Date 2019/12/3 9:12 下午
 * @Created by wangxianlin
 */
public class Theard2 implements Runnable {

    public static void main(String[] args) {
        Theard2 theard2 = new Theard2();
        Thread t1 = new Thread(theard2);
        t1.setName("线程1");
        Thread t2 = new Thread(theard2);
        t1.setName("线程2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        int count = 0;
        for(int i =0 ; i <10 ;i++){
            count++;
            System.out.println("运行第"+count+"次");
        }
    }
}
