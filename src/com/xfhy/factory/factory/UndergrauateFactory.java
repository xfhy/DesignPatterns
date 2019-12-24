package com.xfhy.factory.factory;

/**
 * @author : xfhy
 * Create time : 2019/12/24 23:14
 * Description : 学雷锋的大学生工厂
 */
class UndergrauateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergrauate();
    }
}
