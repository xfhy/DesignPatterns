package com.xfhy.factory.abstractfactory.plus;

/**
 * Created by xfhy on 2019/12/27 14:12
 * Description :
 *
 * 只需要修改DataAccess里面的DB名称,即可  创建各种对象
 */
class TestPlusFactory {

    public static void main(String[] args) {
        /*
        * 输出
        * Access 插入user User{id='1', name='小菜'}
        Access 根据id查询到了user xxxx
        Access 插入Department Department{departmentId='2', depatmentName='运维'}
        Access 根据id查询到了Department xxxx
        * */
        IControlUser user = DataAccess.createUser();

        User user1 = new User();
        user1.id = "1";
        user1.name = "小菜";
        user.insert(user1);
        user.getUserById("dasd");

        IDepartment department = DataAccess.createDepartment();

        Department department1 = new Department();
        department1.departmentId = "2";
        department1.depatmentName = "运维";
        department.insert(department1);
        department.getDepartmentById("dasdsa");
    }

}
