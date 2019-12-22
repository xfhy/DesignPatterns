package com.xfhy.strategy.factory;

/**
 * @author : xfhy
 * Create time : 2019/12/22 22:44
 * Description :
 */
class TestFactory {

    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("打8折");
        System.out.println(cashSuper.acceptCash(100));

        cashSuper = CashFactory.createCashAccept("正常收费");
        System.out.println(cashSuper.acceptCash(100));

        cashSuper = CashFactory.createCashAccept("满300减100");
        System.out.println(cashSuper.acceptCash(600));
    }

}
