package com.xfhy.state;

/**
 * @author : xfhy
 * Create time : 2019/12/27 21:48
 * Description :
 */
class EveningState extends State {

    @Override
    public void code(Work work) {
        if (work.finish) {
            work.setState(new RestState());
            work.code();
        } else {
            if (work.hour < 21) {
                System.out.println("加班哦,,继续");
            } else {
                work.setState(new SleepState());
                work.code();
            }
        }
    }
}
