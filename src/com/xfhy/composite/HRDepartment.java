package com.xfhy.composite;

/**
 * Created by xfhy on 2019/12/31 16:26
 * Description : 人力资源部 类   树叶节点
 */
class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append(" - ");
        }
        System.out.println(stringBuilder.toString() + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘培训管理");
    }
}
