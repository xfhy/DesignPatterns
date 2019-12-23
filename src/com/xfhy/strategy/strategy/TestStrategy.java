package com.xfhy.strategy.strategy;

/**
 * Created by xfhy on 2019/12/23 10:08
 * Description :
 */
class TestStrategy {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext(new CashNormal());
        System.out.println(cashContext.getResult(100));

        cashContext = new CashContext(new CashRebate(0.8));
        System.out.println(cashContext.getResult(100));

        cashContext = new CashContext(new CashReturn(300, 100));
        System.out.println(cashContext.getResult(600));
    }

}
