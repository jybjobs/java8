package com.plat.demo.design.factory;


import com.plat.demo.design.factory.entity.ICar;
import com.plat.demo.design.factory.entity.MidCar;
import com.plat.demo.design.factory.entity.TopCar;

/**
 * 1. 简单工厂模式:
 *    a. 简单工厂功能类编制步骤
 *    ● 定制抽象产品接口，如ICar。
 *    ● 定制具体产品子类，如类TopCar、MidCar、LowCar。
 *    ● 定制工厂类，如CarSimpleFactory。
 *    简单工厂类的特点：它是一个具体的类，非接口或抽象类。
 *    其中有一个重要的create()方法，利用if…else或switch开关创建所需产品，并返回
 *
 *    b. 使用简单工厂的时候，通常不用创建简单工厂类的类示例，没有创建示例的必要。因此可以把简单工厂类实现成一个工具类，
 *     直接使用静态方法就可以了。也就是说，简单工厂的方法通常是静态的，所以也被称为静态工厂。如果要防止客户端无谓地
 *     创造简单工厂示例，还可以把简单工厂的构造方法私有化。
 */
public class SimpleFactory<T> {

    public static final String TOP_TYPE="topType";
    public static final String MID_TYPE="midType";
   public static ICar create(String type){
       switch (type){
           case TOP_TYPE:
               return new TopCar();
           case MID_TYPE:
               return new MidCar();
       }
       return null;
   }

}


