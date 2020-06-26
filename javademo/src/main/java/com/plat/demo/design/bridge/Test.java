package com.plat.demo.design.bridge;

public class Test {
    public static void main(String[] args) throws Exception {
        ThingManage obj = new ThingManage();
        AbstractThing thing = obj.createThing("com.plat.demo.design.bridge.Letter"); // 创建事物
        thing.createPost("com.plat.demo.design.bridge.SimplePost");//创建功能
        thing.post(); //事物执行功能
    }
}
