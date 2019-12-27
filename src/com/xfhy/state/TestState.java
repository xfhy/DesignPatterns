package com.xfhy.state;

/**
 * @author : xfhy
 * Create time : 2019/12/27 21:50
 * Description :
 */
class TestState {

    public static void main(String[] args) {
        //一个状态一个状态地往后执行

        Work work = new Work();
        work.hour = 9;
        work.code();
        work.hour = 10;
        work.code();
        work.hour = 12;
        work.code();
        work.hour = 13;
        work.code();
        work.hour = 14;
        work.code();
        work.hour = 17;
        work.code();

        work.finish = false;

        work.hour = 19;
        work.code();
        work.hour = 20;
        work.code();
        work.hour = 22;
        work.code();
    }

}
