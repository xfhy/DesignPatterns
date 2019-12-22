package com.xfhy.factory;

/**
 * Created by xfhy on 2019/12/18 20:30
 * Description :
 */
class OperateDiv extends BaseOperate {

    @Override
    public int getResult(int number1, int number2) {
        if (number2 == 0) {
            //throw new IllegalArgumentException("除数不能为0");
            return 0;
        }
        return number1 / number2;
    }
}
