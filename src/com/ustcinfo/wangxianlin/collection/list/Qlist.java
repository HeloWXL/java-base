package com.ustcinfo.wangxianlin.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Qlist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("1");
        list.add("2");

        for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);
                System.out.println("执行if语句成功");
            }
        }
    }
}
