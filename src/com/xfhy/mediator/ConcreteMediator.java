package com.xfhy.mediator;

/**
 * Created by xfhy on 2020/1/7 20:00
 * Description : 具体的中介者   可以操作所有的对象,
 */
class ConcreteMediator implements Mediator {

    public ColleagueColleague1 mColleague1;
    public ColleagueColleague2 mColleague2;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague instanceof ColleagueColleague1) {
            mColleague1.notifyMessage(message);
        } else {
            mColleague2.notifyMessage(message);
        }
    }

}
