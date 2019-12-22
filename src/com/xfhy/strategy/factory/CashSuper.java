package com.xfhy.strategy.factory;

/**
 * @author : xfhy
 * Create time : 2019/12/22 22:34
 * Description :
 */
abstract class CashSuper {

    /**
     * 传入原价  计算真实的价格
     *
     * @param money 原价
     */
    public abstract double acceptCash(double money);

}
