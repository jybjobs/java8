package com.plat.demo.design.observer;

public class ObserverTest {

    public static void main(String[] args) {
        IObserver observer = new Observer();
        Subject subject = new Subject();
        subject.register(observer);
        subject.setData("test info");
        subject.notifyObservers();
    }
}
