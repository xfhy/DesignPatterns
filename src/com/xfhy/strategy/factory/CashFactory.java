package com.xfhy.strategy.factory;

/**
 * @author : xfhy
 * Create time : 2019/12/22 22:34
 * Description :
 */
class CashFactory {

    /**
     * @param type 收银时需要选择的收银方式  原价/打折/满减
     */
    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "正常收费":
            default:
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
        return cashSuper;
    }

}
