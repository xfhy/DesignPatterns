package com.xfhy.bridge;

/**
 * Created by xfhy on 2020/1/5 10:13
 * Description : 手机品牌
 */
abstract class HandsetBrand {

    protected HandsetSoft mHandsetSoft;

    //设置手机软件
    public void setHandsetSoft(HandsetSoft handsetSoft) {
        mHandsetSoft = handsetSoft;
    }

    public abstract void run();

}
