package com.plat.demo.design.observer;

import java.util.Vector;

/**
 * pull 模式
 */
public class PullSubject implements ISubject {

    private Vector<IObserver> vector = new Vector<>();
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void register(IObserver obs) {
      vector.add(obs);
    }

    @Override
    public void unRegister(IObserver obs) {
        if(vector.contains(obs)) vector.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o:vector) {
            o.refresh(this);
        }
    }
}
