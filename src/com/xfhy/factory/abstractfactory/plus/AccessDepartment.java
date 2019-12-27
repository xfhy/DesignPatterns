package com.xfhy.factory.abstractfactory.plus;

/**
 * Created by xfhy on 2019/12/27 14:06
 * Description :
 */
class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("Access 插入Department " + department.toString());
    }

    @Override
    public void getDepartmentById(String departmentId) {
        System.out.println("Access 根据id查询到了Department xxxx");
    }
}
