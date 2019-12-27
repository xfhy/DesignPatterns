package com.xfhy.state;

/**
 * @author : xfhy
 * Create time : 2019/12/27 21:46
 * Description :
 */
class NoonState extends State {

    @Override
    public void code(Work work) {
        if (work.hour < 13) {
            System.out.println("午休工作");
        } else  {
            work.setState(new AfternoonState());
            work.code();
        }
    }
}
