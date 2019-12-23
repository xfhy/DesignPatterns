package com.xfhy.strategy.strategy;

/**
 * Created by xfhy on 2019/12/23 10:11
 * Description : 策略模式的环境
 * <p>
 * 通过构造方法传入不同的算法实现类,然后即可得到结果
 */
class CashContext {

    private CashSuper mCashSuper;

    public CashContext(CashSuper cashSuper) {
        mCashSuper = cashSuper;
    }

    public double getResult(double money) {
        return mCashSuper.acceptCash(money);
    }

}
