package com.ustcinfo.wangxianlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Classname TestCollections
 * @Description TODO 集合工具类
 * @Date 2019/12/3 11:36 下午
 * @Created by wangxianlin
 */
public class TestCollections {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println("排序前："+list);//排序前：[a, b, c, d, e, f]

        System.out.println("该集合中最大值："+ Collections.max(list));//该集合中最大值：f

        System.out.println("该集合中最小值："+Collections.min(list));

        Collections.sort(list);
        System.out.println("排序后："+list);//排序后：

        //使用二分法查找，查找之前须保证呗查找集合是自然有序排序的
        System.out.println("c 在集合中的索引为："+Collections.binarySearch(list,'c'));

        Collections.shuffle(list);
        System.out.println("在进行shuffle排序后："+list);//排序后：

//        System.out.println();
//        System.out.println();
//        System.out.println();
    }

}
