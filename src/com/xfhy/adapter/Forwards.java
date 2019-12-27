package com.xfhy.adapter;

/**
 * @author : xfhy
 * Create time : 2019/12/27 22:38
 * Description :
 */
class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋防守");
    }
}
