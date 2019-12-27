package com.xfhy.adapter;

/**
 * @author : xfhy
 * Create time : 2019/12/27 22:38
 * Description :
 */
class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫防守");
    }
}
