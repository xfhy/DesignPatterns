package com.xfhy.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : xfhy
 * Create time : 2019/12/31 20:33
 * Description : 具体聚集类
 */
class ConcreteAggregate extends Aggregate {

    private List<String> items = new ArrayList<>();

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }

    public Object getFirst() {
        return items.get(0);
    }

    public Object getIndex(int current) {
        if (current >= items.size()) {
            return null;
        }
        return items.get(current);
    }

    public int getCount() {
        return items.size();
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
