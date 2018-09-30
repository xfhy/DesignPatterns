package com.xfhy;

/**
 * author feiyang
 * create at 2018/9/21 11:38
 * description：
 */
public class FlyCar extends SuperCar {

    public FlyCar(ICar iCar) {
        super(iCar);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("FlyCar 我还可以天上飞哟");
    }

    public void fly() {
        System.out.println("我在天上飞");
    }

}
