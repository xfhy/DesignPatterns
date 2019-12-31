package com.xfhy.singleton;

/**
 * @author : xfhy
 * Create time : 2019/12/31 22:18
 * Description : 延迟加载  &&  线程安全
 */
class InnerSingleton {

    private InnerSingleton(){}

    public static InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

}
