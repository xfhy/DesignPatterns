package com.xfhy.command;

/**
 * @author : xfhy
 * Create time : 2020/1/6 21:55
 * Description : 烤羊肉串
 */
class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void excuteCommand() {
        mBarbecuer.bakeMutton();
    }

    @Override
    public String toString() {
        return "烤羊肉串";
    }
}
