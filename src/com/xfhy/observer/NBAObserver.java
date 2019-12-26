package com.xfhy.observer;

/**
 * @author : xfhy
 * Create time : 2019/12/26 23:08
 * Description : 看NBA的同事
 */
class NBAObserver extends Observer {

    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update(String action) {
        System.out.println(action + " , 不看NBA了,继续上班");
    }
}
