package com.xfhy;

/**
 * author feiyang
 * create at 2018/9/21 11:39
 * description：
 */
public class WaterCar extends SuperCar {
    public WaterCar(ICar iCar) {
        super(iCar);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("WaterCar 我还可以水里游哟");
    }

    public void swim() {
        System.out.println("我在水里游");
    }

}
