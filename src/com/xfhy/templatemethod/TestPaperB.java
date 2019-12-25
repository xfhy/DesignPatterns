package com.xfhy.templatemethod;

/**
 * @author : xfhy
 * Create time : 2019/12/25 22:00
 * Description :
 */
class TestPaperB extends TestPaper {

    @Override
    protected String getAnswer1() {
        return "d";
    }

    @Override
    protected String getAnswer2() {
        return "c";
    }

    @Override
    protected String getAnswer3() {
        return "a";
    }
}
