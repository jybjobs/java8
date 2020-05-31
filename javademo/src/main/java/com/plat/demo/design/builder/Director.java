package com.plat.demo.design.builder;

/**
 * 生成器模式也称为建造者模式。
 * 生成器模式的意图在于将一个复杂的构建与其表示相分离，
 * 使得同样的构建过程可以创建不同的表示。
 *
 * 生成器设计模式涉及4个关键角色：产品（Product）、抽象生成器（IBuild）、具体生成器（Builder）、指挥者（Director）。
 */

import com.plat.demo.design.builder.entity.Product;

/**
 *  1. 。Director类即是对“流程”的封装类，其中的build()方法决定了具体的流程控制过程。
 */
public class Director<T> {
   private IBuild<T> build;

    public Director(IBuild<T> build) {
        this.build = build;
    }

    public T build(){
        build.createUnit1();
        build.createUnit2();
       return build.composite();
    }

}
