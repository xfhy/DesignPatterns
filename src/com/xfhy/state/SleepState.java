package com.xfhy.state;

/**
 * @author : xfhy
 * Create time : 2019/12/27 21:49
 * Description :
 */
class SleepState extends State {

    @Override
    public void code(Work work) {
        System.out.println("睡觉了");
    }
}
