package com.xfhy.visitor;

/**
 * Created by xfhy on 2020/1/8 14:31
 * Description :
 */
class Man implements Person {

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }

    @Override
    public String getTypeName() {
        return "男人";
    }
}
