package com.ustcinfo.wangxianlin.designPattern;


/**
 * @Description: 抽象组件
 * @params:
 * @return:
 * @Author: wangxianlin
 * @Date: 2020/10/11 7:10 PM
 */
public interface Drink {

    /**
     * @Description: 描述
     * @params: []
     * @return: void
     * @Author: wangxianlin
     * @Date: 2020/10/11 7:11 PM
     */
    String desc();

    
    /**
    * @Description: 价格
    * @params: []
    * @return: void
    * @Author: wangxianlin
    * @Date: 2020/10/11 7:11 PM
    */ 
    double price();

}
