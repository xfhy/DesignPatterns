package com.xfhy.state;

/**
 * @author : xfhy
 * Create time : 2019/12/27 21:47
 * Description :
 */
class AfternoonState extends State {

    @Override
    public void code(Work work) {
        if (work.hour < 17) {
            System.out.println("下午工作");
        } else  {
            work.setState(new EveningState());
            work.code();
        }
    }
}
