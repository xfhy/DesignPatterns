package com.xfhy;

/**
 * author feiyang
 * create at 2018/9/30 9:22
 * description：
 */
public class Client {

    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight google = flyweightFactory.getFlyWeight("Google");
        Flyweight google1 = flyweightFactory.getFlyWeight("Google");
        Flyweight google2 = flyweightFactory.getFlyWeight("Google");
        Flyweight google3 = flyweightFactory.getFlyWeight("Google");
        Flyweight google4 = flyweightFactory.getFlyWeight("Google");

        Flyweight ali = flyweightFactory.getFlyWeight("Ali");
        Flyweight ali1 = flyweightFactory.getFlyWeight("Ali");
        Flyweight ali2 = flyweightFactory.getFlyWeight("Ali");

        System.out.println(google == google1);
        System.out.println(ali == ali1);
        System.out.println(flyweightFactory.getFactorySize());

    }
}
