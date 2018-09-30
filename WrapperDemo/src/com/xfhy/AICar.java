package com.xfhy;

/**
 * author feiyang
 * create at 2018/9/21 11:39
 * description：
 */
public class AICar extends SuperCar {
    public AICar(ICar iCar) {
        super(iCar);
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }

    private void autoMove() {
        System.out.println("我可以自动跑");
    }
}
