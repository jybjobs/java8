package com.plat.demo.design.observer;

/**
 * 推数据方式是指具体主题将变化后的数据全部交给具体观察者，即将变化后的数据、直接传递给具体观察者用于更新数据
 */
public class PushObserver implements IObserver<String> {
    @Override
    public void refresh(String data) {

    }
}
