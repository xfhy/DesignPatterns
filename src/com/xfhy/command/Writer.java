package com.xfhy.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : xfhy
 * Create time : 2020/1/6 21:58
 * Description : 服务员
 */
class Writer {

    private List<Command> mCommands = new ArrayList<>();

    /**
     * 点菜  增加某个命令
     */
    public void addOrder(Command command) {
        //假设有个条件  羊肉串没有了
        if (command instanceof BakeMuttonCommand) {
            System.out.println("羊肉串没有了");
        } else {
            System.out.println(System.currentTimeMillis() + " 增加订单:" + command.toString());
            mCommands.add(command);
        }
    }

    public void removeOrder(Command command) {
        System.out.println(System.currentTimeMillis() + " 取消订单:" + command.toString());
        mCommands.remove(command);
    }

    /**
     * 通知烧烤师傅开始搞
     */
    public void notifyCommand() {
        for (Command command : mCommands) {
            command.excuteCommand();
        }
    }

}
