package com.xfhy.command;

/**
 * @author : xfhy
 * Create time : 2020/1/6 22:04
 * Description :
 */
class TestCommand {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        BakeMuttonCommand bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
        BakeChickenWingCommand bakeChickenWingCommand1 = new BakeChickenWingCommand(barbecuer);
        BakeChickenWingCommand bakeChickenWingCommand2 = new BakeChickenWingCommand(barbecuer);
        BakeChickenWingCommand bakeChickenWingCommand3 = new BakeChickenWingCommand(barbecuer);
        Writer writer = new Writer();

        writer.addOrder(bakeMuttonCommand);
        writer.addOrder(bakeChickenWingCommand1);
        writer.addOrder(bakeChickenWingCommand2);
        writer.addOrder(bakeChickenWingCommand3);
        writer.removeOrder(bakeChickenWingCommand1);
        writer.notifyCommand();

        /*
        * 羊肉串没有了
        1578319623679 增加订单:烤鸡翅
        1578319623679 增加订单:烤鸡翅
        1578319623679 增加订单:烤鸡翅
        1578319623679 取消订单:烤鸡翅
        烤鸡翅
        烤鸡翅
        * */

    }

}
