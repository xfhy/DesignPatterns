package com.xfhy.bridge;

/**
 * Created by xfhy on 2020/1/5 10:15
 * Description :
 */
class TestBridge {

    public static void main(String[] args) {
        HandsetBrand handsetBrand;

        handsetBrand = new HandsetBrandN();
        handsetBrand.setHandsetSoft(new HandsetGame());
        handsetBrand.run();
        handsetBrand.setHandsetSoft(new HandsetAddressList());
        handsetBrand.run();

        handsetBrand = new HandsetBrandM();
        handsetBrand.setHandsetSoft(new HandsetGame());
        handsetBrand.run();
        handsetBrand.setHandsetSoft(new HandsetAddressList());
        handsetBrand.run();
    }

}
