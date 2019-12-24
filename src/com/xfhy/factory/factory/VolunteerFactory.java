package com.xfhy.factory.factory;

/**
 * @author : xfhy
 * Create time : 2019/12/24 23:14
 * Description : 社区志愿者工厂
 */
class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
