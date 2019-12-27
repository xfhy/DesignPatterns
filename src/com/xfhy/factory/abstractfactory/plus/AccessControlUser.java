package com.xfhy.factory.abstractfactory.plus;

/**
 * Created by xfhy on 2019/12/27 14:04
 * Description :
 */
class AccessControlUser implements IControlUser {

    @Override
    public void insert(User user) {
        System.out.println("Access 插入user " + user.toString());
    }

    @Override
    public void getUserById(String id) {
        System.out.println("Access 根据id查询到了user xxxx");
    }
}
