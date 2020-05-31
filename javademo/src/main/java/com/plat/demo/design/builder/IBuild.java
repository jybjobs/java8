package com.plat.demo.design.builder;


public interface IBuild<T> {

   abstract void createUnit1();
   abstract void createUnit2();
   abstract T composite();
}
