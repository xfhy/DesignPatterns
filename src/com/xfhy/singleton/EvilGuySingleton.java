package com.xfhy.singleton;

/**
 * @author : xfhy
 * Create time : 2019/12/31 22:10
 * Description : 恶汉
 */
class EvilGuySingleton {

    private static final EvilGuySingleton INSTANCE = new EvilGuySingleton();

    private EvilGuySingleton() {
    }

    public static EvilGuySingleton getInstance() {
        return INSTANCE;
    }

}
