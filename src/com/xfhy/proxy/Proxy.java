package com.xfhy.proxy;

/**
 * @author : xfhy
 * Create time : 2019/12/24 20:51
 * Description :
 */
class Proxy implements GiveGift {

    Pursuit gg;

    public Proxy(SchoolGirl schoolGirl) {
        gg = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        System.out.print("我是代理人 戴笠 ,");
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        System.out.print("我是代理人 戴笠 ,");
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        System.out.print("我是代理人 戴笠 ,");
        gg.giveChocolate();
    }
}
