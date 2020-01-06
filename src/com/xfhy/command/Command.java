package com.xfhy.command;

/**
 * @author : xfhy
 * Create time : 2020/1/6 21:52
 * Description : 命令
 */
abstract class Command {

    /**
     * 烧烤师傅  执行命令
     */
    protected Barbecuer mBarbecuer;

    public Command(Barbecuer barbecuer) {
        mBarbecuer = barbecuer;
    }

    /**
     * 执行命令
     */
    abstract void excuteCommand();

}
