package com.xfhy.visitor;

/**
 * Created by xfhy on 2020/1/8 14:35
 * Description :
 */
class Woman implements Person{

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }

    @Override
    public String getTypeName() {
        return "女人";
    }
}
