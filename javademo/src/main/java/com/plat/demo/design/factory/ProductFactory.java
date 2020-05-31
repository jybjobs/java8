package com.plat.demo.design.factory;


/**
 * 工厂类高级使用： 通过反射和泛型，不用为每个类创建工厂类，
 * 抽象方法create也可以不用抽象
 * @param <T>
 */
public class ProductFactory<T> {
    public  T create (String className){
        try {
            Class clazz = Class.forName(className);
            return (T) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
