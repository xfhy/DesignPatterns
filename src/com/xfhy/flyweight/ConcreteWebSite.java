package com.xfhy.flyweight;

/**
 * @author : xfhy
 * Create time : 2020/1/7 22:39
 * Description : 具体网站类
 */
class ConcreteWebSite implements WebSite {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类: " + name + "  用户:" + user.getName());
    }

}
