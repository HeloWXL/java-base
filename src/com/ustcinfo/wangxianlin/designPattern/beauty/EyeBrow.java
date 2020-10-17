package com.ustcinfo.wangxianlin.designPattern.beauty;

/**
 * @Description: 眉毛
 */
public class EyeBrow extends AbstractDecorate{

    public EyeBrow(Character character) {
        super(character);
    }

    @Override
    public String touchUp() {
        return super.touchUp()+"+画眉毛";
    }
}
