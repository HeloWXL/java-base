package com.ustcinfo.wangxianlin.designPattern2;

public class Test {

    public static void main(String[] args) {
        Hair leftHair = new LeftHair();
        leftHair.draw();

        Hair rightHair = new RightHair();
        rightHair.draw();

        System.out.println("华丽的分割线---------------------");

        Hair leftHairs = new HairFactory().getHair("left");
        leftHairs.draw();
        Hair rightHairs = new HairFactory().getHair("right");
        rightHair.draw();

        System.out.println("华丽的分割线---------------------");

        Hair leftHairs2 = new HairFactory().getHairByClass("com.ustcinfo.wangxianlin.designPattern2.LeftHair");
        leftHairs.draw();
        Hair rightHairs2 = new HairFactory().getHair("com.ustcinfo.wangxianlin.designPattern2.RightHair");
        rightHair.draw();
    }
}
