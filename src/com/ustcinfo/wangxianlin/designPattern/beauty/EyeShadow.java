package com.ustcinfo.wangxianlin.designPattern.beauty;


/**
* @Description: 眼影
*/
public class EyeShadow extends AbstractDecorate{
    public EyeShadow(Character character) {
        super(character);
    }

    @Override
    public String touchUp() {
        return super.touchUp()+"+涂眼影";
    }
}
