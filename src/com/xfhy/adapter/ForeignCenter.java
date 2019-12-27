package com.xfhy.adapter;

/**
 * @author : xfhy
 * Create time : 2019/12/27 22:25
 * Description : 外籍中锋
 */
class ForeignCenter extends Player {

    @Override
    public void attack() {
        System.out.println("外籍中锋进攻");
    }

    @Override
    public void defense() {
        System.out.println("外籍中锋防守");
    }
}
