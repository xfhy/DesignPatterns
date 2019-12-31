package com.xfhy.composite;

/**
 * Created by xfhy on 2019/12/31 16:27
 * Description :财务部 类   树叶节点
 */
class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(name + "公司财务收支管理");
    }
}
