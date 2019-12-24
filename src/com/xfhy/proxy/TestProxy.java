package com.xfhy.proxy;

/**
 * @author : xfhy
 * Create time : 2019/12/24 21:08
 * Description :
 */
class TestProxy {

    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.name = "qiaoqiao";

        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveFlowers();
        proxy.giveChocolate();
        proxy.giveDolls();
    }

}
