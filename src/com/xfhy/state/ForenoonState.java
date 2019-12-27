package com.xfhy.state;

/**
 * Created by xfhy on 2019/12/27 16:05
 * Description :
 */
class ForenoonState extends State {

    @Override
    public void code(Work work) {
        if (work.hour < 12) {
            System.out.println("上午工作");
        } else  {

        }
    }
}
