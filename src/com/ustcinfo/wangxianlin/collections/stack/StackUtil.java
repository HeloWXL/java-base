package com.ustcinfo.wangxianlin.collections.stack;

/**
 * @Classname StackUtil
 * @Description TODO
 * @Date 2019/12/3 10:37 下午
 * @Created by wangxianlin
 */
public interface StackUtil {
    //把数据元素压入栈-进栈
    public void push(Object obj) throws Exception;
    //获取并删除栈顶数据元素-退栈
    public Object pop() throws Exception;
    //获取但不删除栈顶数据元素
    public Object getTop() throws Exception;
    //判断栈是否为空
    public boolean notEmpty();
}
