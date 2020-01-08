package com.xfhy.interpreter;

/**
 * Created by xfhy on 2020/1/8 13:41
 * Description : 音符类
 */
class Scale extends Expression {

    @Override
    protected void excute(String playKey, double playValue) {
        String scale = "";
        int result = (int) playValue;
        switch (result) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
        }
        System.out.println(scale + " ");
    }
}
