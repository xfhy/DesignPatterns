package com.xfhy.strategy.strategy;

/**
 * @author : xfhy
 * Create time : 2019/12/22 22:36
 * Description : 正常收费的 直接返回原价
 */
class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
