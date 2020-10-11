package com.ustcinfo.wangxianlin.designPattern;

public class RedBean extends Decorate {


    public RedBean(Drink drink) {
        super(drink);
    }

    
    /**
    * @Description: 加红豆
    * @params: []
    * @return: java.lang.String
    * @Author: wangxianlin
    * @Date: 2020/10/11 7:29 PM
    */ 
    @Override
    public String desc() {
        return super.desc()+"+红豆";
    }


    /**
    * @Description: 加价2.0元
    * @params: []
    * @return: double
    * @Author: wangxianlin
    * @Date: 2020/10/11 7:30 PM
    */ 
    @Override
    public double price() {
        return super.price()+2.0;
    }
}
