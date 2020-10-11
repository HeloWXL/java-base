package com.ustcinfo.wangxianlin.designPattern;


/**
* @Description: 装饰器
 *              1.抽象类
 *              2.实现抽象组件接口
 *              3.持有抽象接口的引用
* @params:
* @return:
* @Author: wangxianlin
* @Date: 2020/10/11 7:22 PM
*/
public abstract class Decorate implements Drink{

    /**
    * @Description: 定义私有的饮品接口引用
    */
    private Drink drink;

    public Decorate(Drink drink){
        this.drink = drink;
    }


    @Override
    public String desc() {
        return drink.desc();
    }


    @Override
    public double price() {
        return drink.price();
    }
}
