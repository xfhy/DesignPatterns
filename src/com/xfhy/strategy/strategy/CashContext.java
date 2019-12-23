package com.xfhy.strategy.strategy;

/**
 * Created by xfhy on 2019/12/23 10:11
 * Description : 策略模式的环境
 * <p>
 * 1. 原始策略模式  : 通过构造方法传入不同的算法实现类,然后即可得到结果.  但是每次都需要在外面创建策略的算法,外界需要了解的就特别多,每次改动也需要在外面改.
 * 2. 策略+工厂 : 可以配合简单工厂模式,在环境类里面构建算法类,外面无需了解内部任何类,只需和环境类打交道.
 */
class CashContext {

    //private CashSuper mCashSuper;
    private String type;

    /*public CashContext(CashSuper cashSuper) {
        mCashSuper = cashSuper;
    }*/

    public CashContext(String type) {
        this.type = type;
    }

    public double getResult(double money) {
        CashSuper cashSuper;
        switch (type) {
            case "正常收费":
            default:
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
        return cashSuper.acceptCash(money);
    }

}
