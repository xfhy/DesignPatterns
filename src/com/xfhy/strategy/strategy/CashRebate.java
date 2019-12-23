package com.xfhy.strategy.strategy;

/**
 * @author : xfhy
 * Create time : 2019/12/22 22:36
 * Description : 打折
 */
class CashRebate extends CashSuper {

    /**
     * 折扣
     */
    public double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
