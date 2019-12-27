package com.xfhy.adapter;

/**
 * @author : xfhy
 * Create time : 2019/12/27 22:24
 * Description : 运动员抽象类
 */
abstract class Player {

    protected String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();

}
