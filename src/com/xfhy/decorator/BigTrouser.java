package com.xfhy.decorator;

/**
 * @author : xfhy
 * Create time : 2019/12/23 23:07
 * Description :
 */
class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.print("垮裤 ");
        super.show();
    }
}
