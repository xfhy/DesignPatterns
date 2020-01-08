package com.xfhy.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xfhy on 2020/1/8 14:52
 * Description :
 */
class ObjectStructure {

    private List<Person> mPersonList = new ArrayList<>();

    public void attach(Person person) {
        mPersonList.add(person);
    }

    public void detach(Person person) {
        mPersonList.remove(person);
    }

    public void display(Action visitor) {
        for (Person person : mPersonList) {
            person.accept(visitor);
        }
    }

}
