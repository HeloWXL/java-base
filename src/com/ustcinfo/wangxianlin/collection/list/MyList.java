package com.ustcinfo.wangxianlin.collection.list;

/**
 * @Classname MyList
 * @Description TODO
 * @Date 2019/12/3 9:50 下午
 * @Created by wangxianlin
 */
public class MyList implements ListUtil {
    //设置默认线性表的长度
    final int defaultSize = 10 ;
    //线性表的长度
    int maxSize;
    //线性表中现有的元素个数
    int size ;
    //用对象数组存储线性表
    Object listArray[];
    //无参的构造方法
    MyList(){
        initiate(defaultSize);
    }
    //带线性表长度的构造方法
    MyList(int size){
        initiate(size);
    }

    //初始化方法，设置线性表长度，现有元素个数和初始化对象数组（用线性表长度）
    public void initiate(int sz){
        maxSize = sz;
        size = 0;
        listArray = new Object[sz];
    }

    @Override
    public void insert(int i, Object obj)throws Exception {
        if(i==maxSize){
            throw new Exception("线性表已满，无法插入");
        }
        if(i>size){
            throw new Exception("插入下标的位置错误");
        }
        for(int j = size;j>i;j--){
            listArray[j] = listArray[j-1];
        }
        //插入数据元素，并增加线性表中现有的元素个数
        listArray[i] = obj;
        size++;
    }

    /***
     * @Author wangxl
     * @Description //TODO 实现删除指定下标位置的数据元素
     * @Date 10:23 下午 2019/12/3
     * @Param [i]
     * @return java.lang.Object
     **/
    @Override
    public Object delete(int i) throws Exception {
        if(size==0){
            throw new Exception("线性表已空，无法删除");
        }
        if(i>size-1){
            throw new Exception("删除下标位置错误");
        }

        //获取被删除的数据元素
        Object o = listArray[i];
        //将删除位置后的数据元素全部前移
        for(int j=i;j<size-1;j--){
            listArray[j]=listArray[i];
        }
        //返回被删除数据元素，并减少线性表中现有元素个数
        size--;
        return o;
    }

    /***
     * @Author wangxl
     * @Description //TODO  实现替换指定下标位置的数据元素
     * @Date 10:24 下午 2019/12/3
     * @Param [i, obj]
     * @return void
     **/
    @Override
    public void update(int i, Object obj) throws Exception {
        if(size==0){
            throw new Exception("线性表已空，无法获取");
        }
        if(i>size-1){
            throw new Exception("替换下标位置错误");
        }
        listArray[i] = obj;
    }

    /***
     * @Author wangxl
     * @Description //实现获取指定下标位置的数据元素
     * @Date 10:09 下午 2019/12/3
     * @Param [i]
     * @return java.lang.Object
     **/
    @Override
    public Object getData(int i) throws Exception {
        if(size==0){
            throw new Exception("线性表已空，无法获取");
        }
        if(i>=size){
            throw new Exception("获取下标位置错误！");
        }
        return listArray[i];
    }

    /***
     * @Author wangxl
     * @Description //TODO 实现获取线性表数据元素的个数
     * @Date 10:10 下午 2019/12/3
     * @Param []
     * @return int
     **/
    @Override
    public int size() {
        return size;
    }

    /***
     * @Author wangxl
     * @Description //TODO 实现判断线性表是否为空
     * @Date 10:11 下午 2019/12/3
     * @Param []
     * @return boolean
     **/
    @Override
    public boolean isEmpry() {
        return size==0;
    }
}
