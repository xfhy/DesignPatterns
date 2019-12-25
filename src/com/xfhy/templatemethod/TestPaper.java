package com.xfhy.templatemethod;

/**
 * @author : xfhy
 * Create time : 2019/12/25 21:57
 * Description :
 */
abstract class TestPaper {

    public void testQuestion1() {
        System.out.println("第一题");
        System.out.println(getAnswer1());
    }

    public void testQuestion2() {
        System.out.println("第二题");
        System.out.println(getAnswer2());
    }

    public void testQuestion3() {
        System.out.println("第三题");
        System.out.println(getAnswer3());
    }

    protected abstract String getAnswer1();

    protected abstract String getAnswer2();

    protected abstract String getAnswer3();

}
