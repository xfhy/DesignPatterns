package com.xfhy.visitor;

/**
 * Created by xfhy on 2020/1/8 14:30
 * Description : 状态
 */
interface Action {

    void getManConclusion(Man concreteElementA);

    void getWomanConclusion(Woman concreteElementB);

    String getTypeName();
}
