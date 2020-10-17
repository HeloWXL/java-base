package com.ustcinfo.wangxianlin.designPattern.beauty;
/**
 * @Description: 被装饰者 女生
 */
public class Girl implements Character{

    @Override
    public String touchUp() {
        return "我是个漂亮女生，我想发自拍，我要美颜 ";
    }
}
