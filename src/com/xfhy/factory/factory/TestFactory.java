package com.xfhy.factory.factory;

/**
 * @author : xfhy
 * Create time : 2019/12/24 23:16
 * Description :
 */
class TestFactory {

    public static void main(String[] args) {
        //1. 工厂1
        //IFactory factory = new VolunteerFactory();
        //2. 工厂2   切换工厂时,只需付出极小的代价,即可.且不影响之前的代码   开放-封闭原则
        IFactory factory = new UndergrauateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();

        leiFeng.buyRice();
        leiFeng.wash();
        leiFeng.sweep();
    }

}
