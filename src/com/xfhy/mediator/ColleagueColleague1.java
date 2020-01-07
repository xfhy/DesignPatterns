package com.xfhy.mediator;

/**
 * Created by xfhy on 2020/1/7 20:01
 * Description : 具体的同事类
 */
class ColleagueColleague1 extends Colleague {

    public ColleagueColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void send(String message) {
        mMediator.send(message, this);
    }

    @Override
    void notifyMessage(String message) {
        System.out.println("我是同事1 " + message);
    }
}
