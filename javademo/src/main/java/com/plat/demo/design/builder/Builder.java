package com.plat.demo.design.builder;

import com.plat.demo.design.builder.entity.Product;
import com.plat.demo.design.builder.entity.Unit1;
import com.plat.demo.design.builder.entity.Unit2;

public class Builder implements IBuild<Product> {
    private Product product = new Product();

    public void createUnit1(){
       product.unit1 = new Unit1();
    }

    public void  createUnit2(){
        product.unit2 = new Unit2();
    }

    public Product composite(){
        return product;
    }
}
