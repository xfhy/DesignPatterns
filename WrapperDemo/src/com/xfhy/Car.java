package com.xfhy;

/**
 * author feiyang
 * create at 2018/9/21 9:41
 * description：
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("我是汽车,在公路上跑....");
    }
}
