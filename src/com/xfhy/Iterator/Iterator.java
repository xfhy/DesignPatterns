package com.xfhy.Iterator;

/**
 * @author : xfhy
 * Create time : 2019/12/31 20:30
 * Description : 迭代器
 */
interface Iterator {

    Object first();

    Object next();

    boolean isDone();

    Object currentItem();

}
