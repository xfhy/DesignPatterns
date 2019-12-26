package com.xfhy.facade;

/**
 * Created by xfhy on 2019/12/26 17:42
 * Description : 基金
 */
class Facade {

    private Stock1 mStock1;
    private Stock2 mStock2;
    private Stock3 mStock3;

    public Facade() {
        mStock1 = new Stock1();
        mStock2 = new Stock2();
        mStock3 = new Stock3();
    }

    /**
     * 购买基金
     */
    public void buyFund() {
        mStock1.buy();
        mStock2.buy();
        mStock3.buy();
    }

    public void sellFund() {
        mStock1.sell();
        mStock2.sell();
        mStock3.sell();
    }

}
