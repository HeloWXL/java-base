package com.ustcinfo.wangxianlin.reflection;


public class Reflections {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.ustcinfo.wangxianlin.reflection.Cat");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


