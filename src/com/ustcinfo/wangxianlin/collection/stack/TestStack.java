package com.ustcinfo.wangxianlin.collection.stack;

/**
 * @Classname TestStack
 * @Description TODO
 * @Date 2019/12/3 10:50 下午
 * @Created by wangxianlin
 */
public class TestStack {

    public static void main(String[] args) {
        //创建一个空栈
        StackUtil myStack = new MyStack();
        int arr[] = {1,3,5,4,6,7};
        int n = 6;
        for (int i = 0 ; i<n;i++){
            try {
                myStack.push(new Integer(arr[i]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //获取栈顶数据元素
        try {
            System.out.println("当前栈顶元素为："+myStack.getTop());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("元素的出栈序列为：");
        while (myStack.notEmpty()){//判断栈是否为空
            try {
                System.out.println(myStack.pop());//逐个出栈
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
