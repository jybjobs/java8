package com.plat.demo.design.observer;


/**
 * “拉”数据方式的特点是观察者对象可间接获得变化后的主题数据，观察者自己把数据“拉”过来。
 */
public class PullObserver implements IObserver<ISubject> {
    @Override
    public void refresh(ISubject subject) {
        PullSubject obj = (PullSubject) subject;
        System.out.println( this.getClass()+" received the data : " + obj.getData());
    }
}
