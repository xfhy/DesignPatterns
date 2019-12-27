package com.xfhy.factory.abstractfactory.plus;

/**
 * Created by xfhy on 2019/12/27 14:04
 * Description :
 */
class SqlserverControlUser implements IControlUser {

    @Override
    public void insert(User user) {
        System.out.println("sql server 插入user " + user.toString());
    }

    @Override
    public void getUserById(String id) {
        System.out.println("sql server 根据id查询到了user xxxx");
    }
}
