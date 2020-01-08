package com.xfhy.visitor;

/**
 * Created by xfhy on 2020/1/8 14:31
 * Description :
 */
interface Person {
    void accept(Action visitor);

    String getTypeName();

}
