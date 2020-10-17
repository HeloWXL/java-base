package com.ustcinfo.wangxianlin.designPattern.beauty;

/**
* @Description: 装饰器
 *              1.抽象类
 *              2.实现抽象组件接口
 *              3.持有抽象接口的引用
*/
public abstract class AbstractDecorate implements Character {

    /**
    * @Description: 定义私有的人物接口引用
    */
    private Character character;

    public AbstractDecorate(Character character){
        this.character = character;
    }

    /**
     * @Description: 补妆
     */
    @Override
    public String touchUp() {
        return this.character.touchUp();
    }
}
