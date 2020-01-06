package com.xfhy.command;

/**
 * @author : xfhy
 * Create time : 2020/1/6 21:55
 * Description : 烤鸡腿
 */
class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void excuteCommand() {
        mBarbecuer.bakeChickenWing();
    }

    @Override
    public String toString() {
        return "烤鸡翅";
    }

}
