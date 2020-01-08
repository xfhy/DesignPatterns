package com.xfhy.visitor;

/**
 * Created by xfhy on 2020/1/8 14:55
 * Description :
 */
class TestVisitor {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        Failing failing = new Failing();
        objectStructure.display(failing);

        Amativeness amativeness = new Amativeness();
        objectStructure.display(amativeness);
    }

}
