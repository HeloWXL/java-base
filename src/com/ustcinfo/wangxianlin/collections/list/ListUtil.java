package com.ustcinfo.wangxianlin.collections.list;

/**
 * @Classname ListUtil
 * @Description TODO 线性表
 * @Date 2019/12/3 9:44 下午
 * @Created by wangxianlin
 */
public interface ListUtil {
    /**
     * 在指定的下标位置插入数据元素
     * @param i
     * @param obj
     */
    public void insert(int i ,Object obj)throws Exception;

    /**
     * 删除指定下标位置的数据元素
     * @param i
     * @return
     * @throws Exception
     */
    public Object delete(int i ) throws Exception;

    /**
     * 替换指定下标位置的数据元素
     * @param i
     * @param obj
     * @throws Exception
     */
    public void update(int i ,Object obj) throws Exception;

    /**
     * 获取指定下标位置的数据元素
     * @param i
     * @return
     * @throws Exception
     */
    public Object getData(int i ) throws Exception;

    /**
     * 获取线性表数据元素个数
     * @return
     */
    public int size();

    /**
     * 判断线性表是否为空
     * @return
     */
    public boolean isEmpry();
}
