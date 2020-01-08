package com.xfhy.interpreter;

/**
 * Created by xfhy on 2020/1/8 13:33
 * Description : 演奏文本
 */
class PlayContext {

    private String text;

    public String getText() {
        return text == null ? "" : text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
