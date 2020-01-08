package com.xfhy.interpreter;

/**
 * Created by xfhy on 2020/1/8 13:34
 * Description : 表达式类
 */
abstract class Expression {

    public void interpret(PlayContext context) {
        if (context.getText().length() == 0) {
            return;
        }
        String playKey = context.getText().substring(0, 1);
        context.setText(context.getText().substring(2));
        double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
        context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));

        excute(playKey, playValue);
    }

    /**
     * 抽象方法执行,不同的文法子类  有不用的执行处理
     */
    protected abstract void excute(String playKey, double playValue);
}
