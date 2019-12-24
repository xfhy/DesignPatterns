package com.xfhy.factory.simple;

/**
 * Created by xfhy on 2019/12/18 19:59
 * Description :
 */
class TestFactory {

    public static void main(String[] args) {
        System.out.println(OperateFactory.getOperate("+").getResult(1, 2));
        System.out.println(OperateFactory.getOperate("-").getResult(1, 2));
        System.out.println(OperateFactory.getOperate("*").getResult(1, 2));
        System.out.println(OperateFactory.getOperate("/").getResult(1, 2));
    }

}
