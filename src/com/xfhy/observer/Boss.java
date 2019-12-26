package com.xfhy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : xfhy
 * Create time : 2019/12/26 23:05
 * Description : 老板 通知类
 */
class Boss implements Subject {

    private List<Observer> mObserverList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        mObserverList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        mObserverList.remove(observer);
    }

    @Override
    public void notifyMy(String action) {
        for (Observer observer : mObserverList) {
            observer.update(action);
        }
    }
}
