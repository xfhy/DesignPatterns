package com.xfhy.builder;

/**
 * Created by xfhy on 2019/12/26 19:20
 * Description :
 */
class PersonFatBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("胖 构建头");
    }

    @Override
    public void buildBody() {
        System.out.println("胖 构建身体");
    }

    @Override
    public void buildArm() {
        System.out.println("胖 构建胳膊");
    }

    @Override
    public void buildLeg() {
        System.out.println("胖 构建腿");
    }
}
