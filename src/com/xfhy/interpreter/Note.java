package com.xfhy.interpreter;

/**
 * Created by xfhy on 2020/1/8 13:39
 * Description : 音符类
 */
class Note extends Expression {

    @Override
    protected void excute(String playKey, double playValue) {
        String note = "";
        switch (playKey) {
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }
        System.out.println(note + " ");
    }
}
