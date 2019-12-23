package com.xfhy.decorator;

/**
 * @author : xfhy
 * Create time : 2019/12/23 23:08
 * Description :
 */
class LeatherShoes extends Finery {

    @Override
    public void show() {
        System.out.print("皮鞋 ");
        super.show();
    }
}
