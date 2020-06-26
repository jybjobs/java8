package com.plat.demo.design.bridge;


/**
 * 桥接模式是关于怎样将抽象部分与它的实现部分分离，使它们都可以独立地变化的成熟模式。
 *
 */
public interface IPost {
    void post();
}


/**
 * 通过AbstractThing类中的成员变量obj，它就像桥梁一样，
 * 使得事物类与功能类巧妙地联系起来，这也是叫作桥接模式的一个重要原因。
 */
abstract  class AbstractThing{
    IPost obj;
    public void createPost(String funcName) throws  Exception{
        obj = (IPost) Class.forName(funcName).newInstance();
    }
    public void post(){
        obj.post();
    }

}


class ThingManage{
    AbstractThing thing;
    AbstractThing createThing(String thingName) throws Exception{
        thing = (AbstractThing) Class.forName(thingName).newInstance();
        return thing;
    }
}



