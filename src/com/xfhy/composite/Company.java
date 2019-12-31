package com.xfhy.composite;

/**
 * Created by xfhy on 2019/12/31 16:16
 * Description : 公司类 抽象
 */
abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 增加
     */
    public abstract void add(Company company);

    /**
     * 移除
     */
    public abstract void remove(Company company);

    /**
     * 显示
     *
     * @param depth 层次
     */
    public abstract void display(int depth);

    /**
     * 履行职责
     */
    public abstract void lineOfDuty();

}
