package com.xfhy;

/**
 * author feiyang
 * create at 2018/9/21 11:22
 * description：
 */
public abstract class SuperCar implements ICar {
    private ICar iCar;

    public SuperCar(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void move() {
        iCar.move();
    }
}
