package com.xfhy.singleton;

/**
 * @author : xfhy
 * Create time : 2019/12/31 21:50
 * Description :
 */
class DoubleCheckSingleton {

    private static DoubleCheckSingleton sSingleton = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        //外面判断一次,避免每次都进入锁区 浪费
        if (sSingleton == null) {
            //可能2个线程同时进入这里,然后这个时候一个线程一个线程地进入锁区域.如果没有第二层判断,则会生成2个实例
            synchronized (DoubleCheckSingleton.class) {
                if (sSingleton == null) {
                    sSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return sSingleton;
    }

}
