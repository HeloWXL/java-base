package com.ustcinfo.wangxianlin.designPattern.beauty;

/**
* @Description: 口红
*/
public class Lipstick extends AbstractDecorate{

    public Lipstick(Character character) {
        super(character);
    }

    @Override
    public String touchUp() {
        return super.touchUp()+"+涂口红";
    }
}
