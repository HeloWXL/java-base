package com.ustcinfo.wangxianlin.thread;

/**
 * @Classname Thread1
 * @Description TODO 线程基础：创建一个基础的线程 继承Thead
 * @Date 2019/12/3 9:02 下午
 * @Created by wangxianlin
 */
public class Thread1 extends Thread{

    public Thread1(String name){
        super(name);
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("线程1");
        Thread1 t2 = new Thread1("线程2");
        t1.start();
        t2.start();
    }

    public void run(){
        int count = 0;
        for(int i =0 ; i <10 ;i++){
            count++;
            System.out.println(this.getName()+"运行第"+(i+1)+"次");
        }
    }

}
