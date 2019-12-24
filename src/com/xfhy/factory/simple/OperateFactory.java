package com.xfhy.factory.simple;

/**
 * Created by xfhy on 2019/12/18 20:33
 * Description :
 */
class OperateFactory {

    public static BaseOperate getOperate(String operate) {
        switch (operate) {
            case "+":
                return new OperateAdd();
            case "-":
                return new OperateReduce();
            case "*":
                return new OperateMul();
            case "/":
                return new OperateDiv();
            default:
                return new BaseOperate() {
                    @Override
                    public int getResult(int number1, int number2) {
                        return 0;
                    }
                };
        }
    }

}
