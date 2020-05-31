package com.plat.demo.design.factory;

import com.plat.demo.design.factory.entity.ICar;
import com.plat.demo.design.factory.entity.MidCar;
import com.plat.demo.design.factory.entity.TopCar;

/**
 * 2. 工厂模式：
 *  a．工厂模式功能类编制步骤
     *  ● 定制抽象产品接口，如ICar。
     *  ● 定制具体产品子类，如类TopCar、MidCar、LowCar。
     *  ● 定制抽象工厂类（或接口），如AbstractFactory。其中有一个重要的create()抽象方法。
     *  ● 定制具体工厂子类，如UpFactory、MidFactory、DnFactory。
 *  b．工厂与简单工厂模式的区别
     *  ● 工厂模式把简单工厂中具体的工厂类（如CarSimpleFactory）划分成两层：
     *  抽象工厂层（如AbstractFactory）+具体工厂子类层（如TopFactory等）。
 *  c.主要特征是：当需求分析发生变化时，只需要增加、删除相应的类，而不是修改已有的类
 */
public abstract class AbstractFactory<T> {
    public abstract T create();
}

class TopFactory extends AbstractFactory<ICar>{
    @Override
    public ICar create() {
        return new TopCar();
    }
}

class MidFactory extends AbstractFactory<ICar>{
    @Override
    public ICar create() {
        return new MidCar();
    }
}
