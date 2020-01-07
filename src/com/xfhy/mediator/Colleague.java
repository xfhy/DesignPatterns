package com.xfhy.mediator;

/**
 * Created by xfhy on 2020/1/7 19:59
 * Description : 抽象的同事类
 */
abstract class Colleague {
    protected Mediator mMediator;

    //得到中介者对象
    public Colleague(Mediator mediator) {
        mMediator = mediator;
    }

    abstract void send(String message);

    abstract void notifyMessage(String message);

}
