package com.xfhy.mediator;

/**
 * Created by xfhy on 2020/1/7 20:01
 * Description :
 */
class ColleagueColleague2 extends Colleague {
    public ColleagueColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    void send(String message) {
        mMediator.send(message, this);
    }

    @Override
    void notifyMessage(String message) {
        System.out.println("我是同事2 " + message);
    }
}
