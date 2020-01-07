package com.xfhy.flyweight;

/**
 * @author : xfhy
 * Create time : 2020/1/7 22:40
 * Description :
 */
class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name == null ? "" : name;
    }
}
