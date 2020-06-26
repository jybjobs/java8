package com.plat.demo.design.bridge;

public class  SimplePost implements IPost{

    @Override
    public void post() {
        System.out.println("Simple post .");
    }
}