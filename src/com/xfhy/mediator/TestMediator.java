package com.xfhy.mediator;

/**
 * Created by xfhy on 2020/1/7 20:06
 * Description :
 */
class TestMediator {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ColleagueColleague1 colleagueColleague1 = new ColleagueColleague1(concreteMediator);
        ColleagueColleague2 colleagueColleague2 = new ColleagueColleague2(concreteMediator);
        concreteMediator.mColleague1 = colleagueColleague1;
        concreteMediator.mColleague2 = colleagueColleague2;

        colleagueColleague1.send("吃过饭了吗?");
        colleagueColleague2.send("没有,你打算请客?");


    }

}
