package com.xfhy.observer;

/**
 * @author : xfhy
 * Create time : 2019/12/26 23:09
 * Description :
 */
class TestObserver {

    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver tongshi1 = new StockObserver("同事1", boss);
        NBAObserver tongshi2 = new NBAObserver("同事2", boss);

        boss.attach(tongshi1);
        boss.attach(tongshi2);

        boss.notifyMy("我胡汉三回来了");

        boss.detach(tongshi1);

        boss.notifyMy("我胡汉三又回来了");
    }

}
