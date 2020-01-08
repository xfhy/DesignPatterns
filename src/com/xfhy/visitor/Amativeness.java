package com.xfhy.visitor;

/**
 * Created by xfhy on 2020/1/8 14:40
 * Description :
 */
class Amativeness implements Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getTypeName() + this.getTypeName() + "时,背后多半有一个伟大的女人.");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getTypeName() + this.getTypeName() + "时,背后大多有一个不成功的男人。");
    }

    @Override
    public String getTypeName() {
        return "恋爱";
    }
}
