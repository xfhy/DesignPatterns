package com.xfhy.facade;

/**
 * Created by xfhy on 2019/12/26 17:44
 * Description :
 */
class TestFacade {

    public static void main(String[] args) {
        //买基金可以避免直接与股票打交道  比较直接与子系统打交道,减少了解,降低耦合.
        Facade facade = new Facade();
        facade.buyFund();
        facade.sellFund();
    }

}
