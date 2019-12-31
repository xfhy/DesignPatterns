package com.xfhy.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : xfhy
 * Create time : 2019/12/31 20:39
 * Description :
 */
class TestIterator {

    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        List<java.lang.String> items = new ArrayList<>();
        items.add("大鸟");
        items.add("小菜");
        items.add("行李");
        items.add("小偷");
        concreteAggregate.setItems(items);

        ConcreteIterator concreteIterator = new ConcreteIterator(concreteAggregate);
        Object first = concreteIterator.first();
        while (!concreteIterator.isDone()) {
            System.out.println(concreteIterator.currentItem());
            concreteIterator.next();
        }

    }

}
