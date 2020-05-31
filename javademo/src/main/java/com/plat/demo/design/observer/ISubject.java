package com.plat.demo.design.observer;

public interface ISubject<T> {

    public void register(IObserver<T> obs);//注册
    public void unRegister(IObserver<T> obs);//卸载
    public void notifyObservers(); //通知
}
