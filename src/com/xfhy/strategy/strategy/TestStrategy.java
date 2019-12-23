package com.xfhy.strategy.strategy;

/**
 * Created by xfhy on 2019/12/23 10:08
 * Description :
 * <p>
 * 1. 原始策略模式  : 通过构造方法传入不同的算法实现类,然后即可得到结果.  但是每次都需要在外面创建策略的算法,外界需要了解的就特别多,每次改动也需要在外面改.
 * 2. 策略+工厂 : 可以配合简单工厂模式,在环境类里面构建算法类,外面无需了解内部任何类,只需和环境类打交道.
 */
class TestStrategy {

    public static void main(String[] args) {
        /*CashContext cashContext = new CashContext(new CashNormal());
        System.out.println(cashContext.getResult(100));

        cashContext = new CashContext(new CashRebate(0.8));
        System.out.println(cashContext.getResult(100));

        cashContext = new CashContext(new CashReturn(300, 100));
        System.out.println(cashContext.getResult(600));*/

        CashContext cashContext = new CashContext("打8折");
        System.out.println(cashContext.getResult(100));

        cashContext = new CashContext("正常收费");
        System.out.println(cashContext.getResult(100));

        cashContext = new CashContext("满300减100");
        System.out.println(cashContext.getResult(600));
    }

}
