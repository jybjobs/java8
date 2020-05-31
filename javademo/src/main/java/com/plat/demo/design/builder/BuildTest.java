package com.plat.demo.design.builder;

import com.plat.demo.design.builder.entity.Product;

public class BuildTest {
    public static void main(String[] args) {
        Director<Product> director = new Director<>(new Builder());
        director.build();
    }
}
