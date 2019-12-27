package com.xfhy.state;

/**
 * Created by xfhy on 2019/12/27 16:01
 * Description :
 */
class Work {

    public int hour;
    public boolean finish;
    private State mState;

    public Work() {
        mState = new ForenoonState();
    }

    public void setState(State state) {
        mState = state;
    }

    public void code() {
        mState.code(this);
    }

}
