package com.ustcinfo.wangxianlin.designPattern;

public class Egg extends Decorate {


    public Egg(Drink drink) {
        super(drink);
    }

    
    /**
    * @Description: 加鸡蛋
    * @params: []
    * @return: java.lang.String
    * @Author: wangxianlin
    * @Date: 2020/10/11 7:31 PM
    */ 
    @Override
    public String desc() {
        return super.desc()+"+鸡蛋";
    }

    
    /**
    * @Description: 加价1.5
    * @params: []
    * @return: double
    * @Author: wangxianlin
    * @Date: 2020/10/11 7:31 PM
    */ 
    @Override
    public double price() {
        return super.price()+1.5;
    }
}
