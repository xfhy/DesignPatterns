package com.xfhy.singleton;

/**
 * @author : xfhy
 * Create time : 2019/12/31 22:03
 * Description : 双重锁
 */
class TestSingleton {

    public static void main(String[] args) {
        if (DoubleCheckSingleton.getInstance() == DoubleCheckSingleton.getInstance()) {
            System.out.println("ok");
        }

        if (EvilGuySingleton.getInstance() == EvilGuySingleton.getInstance()) {
            System.out.println("ok");
        }

        if (InnerSingleton.getInstance() == InnerSingleton.getInstance()) {
            System.out.println("ok");
        }

    }

}
