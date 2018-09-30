package com.xfhy;

/**
 * author feiyang
 * create at 2018/9/30 9:19
 * description：
 */
public class ConcreteFlyweight extends Flyweight {

    private String str;

    public ConcreteFlyweight(String str) {
        this.str = str;
    }

    @Override
    public void operation() {
        System.out.println("Concrete---Flyweight : " + str);
    }
}
