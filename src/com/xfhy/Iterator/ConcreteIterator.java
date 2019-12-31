package com.xfhy.Iterator;

/**
 * @author : xfhy
 * Create time : 2019/12/31 20:32
 * Description : 具体迭代器类   可以有多种迭代器,往前,往后
 */
class ConcreteIterator implements Iterator {

    private ConcreteAggregate mConcreteAggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.mConcreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return mConcreteAggregate.getFirst();
    }

    @Override
    public Object next() {
        current++;
        return mConcreteAggregate.getIndex(current);
    }

    @Override
    public boolean isDone() {
        return current >= mConcreteAggregate.getCount();
    }

    @Override
    public Object currentItem() {
        return mConcreteAggregate.getIndex(current);
    }
}
