package com.ustcinfo.wangxianlin.designPattern;

public class Sugar extends Decorate {

    public Sugar(Drink drink) {
        super(drink);
    }

    /**
    * @Description: 加糖
    * @params: []
    * @return: java.lang.String
    * @Author: wangxianlin
    * @Date: 2020/10/11 7:32 PM
    */ 
    @Override
    public String desc() {
        return super.desc()+"+糖";
    }


    /**
    * @Description: 加价1.0元
    * @params: []
    * @return: double
    * @Author: wangxianlin
    * @Date: 2020/10/11 7:32 PM
    */ 
    @Override
    public double price() {
        return super.price()+1.0;
    }
}
