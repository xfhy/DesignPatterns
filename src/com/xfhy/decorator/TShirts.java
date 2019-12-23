package com.xfhy.decorator;

/**
 * @author : xfhy
 * Create time : 2019/12/23 23:06
 * Description : 具体的服饰类
 */
class TShirts extends Finery {

    @Override
    public void show() {
        System.out.print("T恤 ");
        super.show();
    }
}
