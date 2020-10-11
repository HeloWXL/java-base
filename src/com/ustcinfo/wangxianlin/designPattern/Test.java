package com.ustcinfo.wangxianlin.designPattern;


/**
* @Description: 测试装饰者模式
* @params:
* @return:
* @Author: wangxianlin
* @Date: 2020/10/11 7:33 PM
*/
public class Test {

    public static void main(String[] args) {
        Drink drink  = new Soya();
        System.out.println(drink.desc());
        System.out.println(drink.price());

        //加糖
        Drink drinkSugar = new Sugar(drink);
        System.out.println(drinkSugar.desc());
        System.out.println(drinkSugar.price());

        //加鸡蛋
        Drink drinkEgg = new Egg(drinkSugar);
        System.out.println(drinkEgg.desc());
        System.out.println(drinkEgg.price());
    }
}
