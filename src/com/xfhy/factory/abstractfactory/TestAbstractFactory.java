package com.xfhy.factory.abstractfactory;

/**
 * Created by xfhy on 2019/12/27 10:45
 * Description :
 */
class TestAbstractFactory {

    public static void main(String[] args) {
        PcFactory pcFactory = new HpFactory();
        Mouse mouse = pcFactory.createMouse();
        KeyBo keyBo = pcFactory.createKeyBo();
        mouse.sayHi();
        keyBo.sayHi();

        PcFactory pcFactory2 = new DellFactory();
        KeyBo keyBo1 = pcFactory2.createKeyBo();
        Mouse mouse1 = pcFactory2.createMouse();
        keyBo1.sayHi();
        mouse1.sayHi();
    }

}
