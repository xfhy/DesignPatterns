package com.xfhy.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xfhy on 2019/12/31 16:18
 * Description : 具体的公司类  实现接口  树枝节点
 */
class ConcreteCompany extends Company {

    private List<Company> mChildList = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        mChildList.add(company);
    }

    @Override
    public void remove(Company company) {
        mChildList.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append(" - ");
        }
        System.out.println(stringBuilder.toString() + name);
        for (Company company : mChildList) {
            company.display(depth + 1);
        }
    }

    @Override
    public void lineOfDuty() {
        //打印每个子节点的职责
        for (Company company : mChildList) {
            company.lineOfDuty();
        }
    }
}
