package com.xfhy.strategy.strategy;

/**
 * @author : xfhy
 * Create time : 2019/12/22 22:37
 * Description : 返利收费的那种  比如满300-100 满600-200
 */
class CashReturn extends CashSuper {

    /**
     * 满多少
     */
    public double moneyCondication = 0.0d;
    /**
     * 减多少
     */
    public double moneyReturn = 0.0d;

    public CashReturn(double moneyCondication, double moneyReturn) {
        this.moneyCondication = moneyCondication;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        //减去满减的那部分
        money = money - Math.floor(money / moneyCondication) * moneyReturn;
        return money;
    }
}
