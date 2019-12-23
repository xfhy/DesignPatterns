package com.xfhy.decorator;

/**
 * @author : xfhy
 * Create time : 2019/12/23 23:02
 * Description : ConcreteComponent
 */
class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }

}
