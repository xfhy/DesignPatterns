package com.xfhy.state;

/**
 * @author : xfhy
 * Create time : 2019/12/27 21:48
 * Description :
 */
class RestState extends State {

    @Override
    public void code(Work work) {
        System.out.println("下班回家 " + work.hour);
    }
}
