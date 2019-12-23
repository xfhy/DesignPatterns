package com.xfhy.decorator;

/**
 * @author : xfhy
 * Create time : 2019/12/23 23:04
 * Description : 服饰类
 */
class Finery extends Person {

    private Person component;

    public void setDecorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
