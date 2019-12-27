package com.xfhy.factory.abstractfactory;

/**
 * Created by xfhy on 2019/12/27 10:43
 * Description :
 */
class HpFactory implements PcFactory {

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBo createKeyBo() {
        return new HpKeyBo();
    }
}
