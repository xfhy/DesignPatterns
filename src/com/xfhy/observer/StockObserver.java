package com.xfhy.observer;

/**
 * @author : xfhy
 * Create time : 2019/12/26 23:08
 * Description : 看股票的同事
 */
class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update(String action) {
        System.out.println(action + " , 不看股票了,继续上班");
    }
}
