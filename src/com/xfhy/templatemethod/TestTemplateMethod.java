package com.xfhy.templatemethod;

/**
 * @author : xfhy
 * Create time : 2019/12/25 22:01
 * Description :
 */
class TestTemplateMethod {

    public static void main(String[] args) {
        TestPaper testPaperA = new TestPaperA();
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        System.out.println("---------------------------------");

        TestPaper testPaperB = new TestPaperB();
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }

}
