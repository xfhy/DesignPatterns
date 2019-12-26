package com.xfhy.observer;

/**
 * @author : xfhy
 * Create time : 2019/12/26 23:02
 * Description : 通知者接口
 */
interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyMy(String action);
}
