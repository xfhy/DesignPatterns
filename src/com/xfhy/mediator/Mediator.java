package com.xfhy.mediator;

/**
 * Created by xfhy on 2020/1/7 19:58
 * Description : 抽象中介者 定义了同事对象到中介者对象的接口
 */
interface Mediator {

    void send(String message, Colleague colleague);

}
