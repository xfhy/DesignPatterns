package com.xfhy.observer;

/**
 * @author : xfhy
 * Create time : 2019/12/26 23:03
 * Description : 抽象观察者
 */
abstract class Observer {

    protected String name;
    protected Subject mSubject;

    public Observer(String name, Subject subject) {
        this.name = name;
        mSubject = subject;
    }

    public abstract void update(String action);
}
