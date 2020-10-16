package com.ustcinfo.wangxianlin.designPattern2;

public class HairFactory {

    
    /**
    * @Description: 根据类型返回
    * @params: [key]
    * @return: com.ustcinfo.wangxianlin.designPattern2.Hair
    * @Author: wangxianlin
    * @Date: 2020/10/16 10:24 PM
    */ 
    public Hair getHair(String key){
        if("left".equals(key)){
            return new LeftHair();
        }else if("right".equals(key)){
            return new RightHair();
        }else{
            return null;
        }
    }

    
    /**
    * @Description:  根据类的名称返回
    * @params: [className]
    * @return: com.ustcinfo.wangxianlin.designPattern2.Hair
    * @Author: wangxianlin
    * @Date: 2020/10/16 10:30 PM
    */ 
    public Hair getHairByClass(String className) {
        try {
            Hair hair = (Hair) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.out.println("实例化异常");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("非法访问异常");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("没有找到该类");
        }
        return null;
    }

}
