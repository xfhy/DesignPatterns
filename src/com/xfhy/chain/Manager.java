package com.xfhy.chain;

/**
 * @author : xfhy
 * Create time : 2020/1/6 22:55
 * Description : 管理人员抽象
 */
abstract class Manager {

    /**
     * 管理者的上级
     */
    protected Manager superior;

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract void requestApplications(Request request);

}
