package com.ustcinfo.wangxianlin.reflection;

import java.io.IOException;
import java.nio.CharBuffer;

public class Cat implements Readable{
    /**
     * 名字
    */
    public String name;
    /**
     * 颜色
     */
    private String color;
    /**
     * 品种
     */
    String type;

    /**
     * 无参构造方法
     */
    public Cat() {
    }

    /**
     * 有参构造方法
     */
    public Cat(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    /**
     * 有参构造方法
     */
    public Cat(String name) {
        this.name = name;
    }

    /**
    * @Description:  吃饭
    * @params: []
    * @return: void
    */
    public void eat(){
        System.out.println("吃饭");
    }

    /**
     * @Description:  睡觉
     * @params: []
     * @return: void
     */
    private void sleep(){
        System.out.println("睡觉");
    }

    /**
     * getter setter方法
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
