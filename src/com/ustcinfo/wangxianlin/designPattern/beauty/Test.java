package com.ustcinfo.wangxianlin.designPattern.beauty;

public class Test {

    public static void main(String[] args) {
        Character girl = new Girl();
        System.out.println(girl.touchUp());

        //todo 涂口红
        Character lipStickGirl = new Lipstick(girl);
        System.out.println(lipStickGirl.touchUp());

        //todo 画眉毛
        Character eyeBrowGirl = new EyeBrow(lipStickGirl);
        System.out.println(eyeBrowGirl.touchUp());

        //todo 涂眼影
        Character eyeShadowGirl = new EyeShadow(eyeBrowGirl);
        System.out.println(eyeShadowGirl.touchUp());
    }
}
