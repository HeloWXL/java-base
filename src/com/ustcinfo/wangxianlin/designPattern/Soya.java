package com.ustcinfo.wangxianlin.designPattern;


/**
* @Description: 被装饰者
* @params:
* @return:
* @Author: wangxianlin
* @Date: 2020/10/11 7:16 PM
*/
public class Soya implements Drink{
    
    /**
    * @Description: 描述
    * @params: []
    * @return: void
    * @Author: wangxianlin
    * @Date: 2020/10/11 7:20 PM
    */ 
    @Override
    public String desc() {
        return "纯豆浆";
    }

    
    /**
    * @Description: 豆浆的价格
    * @params: []
    * @return: double
    * @Author: wangxianlin
    * @Date: 2020/10/11 7:20 PM
    */ 
    @Override
    public double price() {
        return 1.5;
    }
}
