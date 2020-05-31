package com.plat.demo.design.factory;

import com.plat.demo.design.factory.entity.ICar;

public class FactoryTest {

    public static void main(String[] args) {
        ICar car = SimpleFactory.create(SimpleFactory.MID_TYPE);
    }
}
