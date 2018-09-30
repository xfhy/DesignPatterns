package com.xfhy;

import java.util.Hashtable;

/**
 * author feiyang
 * create at 2018/9/30 9:20
 * description：
 */
public class FlyweightFactory {

    private Hashtable<Object, Flyweight> flyweights = new Hashtable<>();

    public Flyweight getFlyWeight(Object object) {
        //1. 有缓存 取缓存
        Flyweight flyweight = flyweights.get(object);
        if (flyweight == null) {
            //2. 无缓存 构造一个
            flyweight = new ConcreteFlyweight((String) object);
            //3. 加入缓存
            flyweights.put(object, flyweight);
        }
        return flyweight;
    }

    public int getFactorySize() {
        return flyweights.size();
    }

}
