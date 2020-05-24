package com.ustcinfo.wangxianlin.collection.stack;

/**
 * @Classname MyStack
 * @Description TODO 使用顺序存储结构的数组来存储栈的逻辑结构。
 * @Date 2019/12/3 10:40 下午
 * @Created by wangxianlin
 */
public class MyStack implements StackUtil {

    final static int defaultStack = 10 ;
    //标记栈内元素个数，即栈顶元素
    int top ;
    Object[] stack;
    int maxStackSize;

    public MyStack(){
        initite(defaultStack);
    }
    public MyStack(int sz){
        initite(sz);
    }

    public void initite(int sz){
        maxStackSize = sz;
        top = 0;
        stack = new Object[sz];
    }

    /***
     * @Author wangxl
     * @Description //TODO  实现把数据元素压入栈-进栈
     * @Date 10:44 下午 2019/12/3
     * @Param []
     * @return void
     **/
    @Override
    public void push(Object obj) throws Exception {
        if(top == maxStackSize){
            throw new Exception("堆栈已满！");
        }
        //进栈 ，栈顶标记+1
        stack[top] = obj;
        top++;
    }

    /***
     * @Author wangxl
     * @Description //TODO  实现获取并删除栈顶数据元素--退栈
     * @Date 10:47 下午 2019/12/3
     * @Param []
     * @return java.lang.Object
     **/
    @Override
    public Object pop() throws Exception {
        if(top==0){
            throw new Exception("堆栈已空");
        }
        top--;
        return stack[top];
    }

    /***
     * @Author wangxl
     * @Description //TODO 实现获取但不删除栈顶数据元素
     * @Date 10:48 下午 2019/12/3
     * @Param []
     * @return java.lang.Object
     **/
    @Override
    public Object getTop() throws Exception {
        if(top==0){
            throw new Exception("堆栈已空");
        }
        return stack[top-1];
    }

    /***
     * @Author wangxl
     * @Description //TODO  实现判断栈是否为空
     * @Date 10:49 下午 2019/12/3
     * @Param []
     * @return boolean
     **/
    @Override
    public boolean notEmpty() {
        return (top>0);
    }
}
