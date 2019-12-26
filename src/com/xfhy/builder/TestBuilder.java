package com.xfhy.builder;

/**
 * Created by xfhy on 2019/12/26 19:22
 * Description :
 */
class TestBuilder {

    public static void main(String[] args) {
        PersonBuilder personBuilder1 = new PersonThinBuilder();
        PersonDirector personDirector1 = new PersonDirector(personBuilder1);
        personDirector1.createPerson();

        PersonBuilder personBuilder2 = new PersonFatBuilder();
        PersonDirector personDirector2 = new PersonDirector(personBuilder2);
        personDirector2.createPerson();


        Student.Builder builder = new Student.Builder();
        Student student = builder.age(1).name("小明").build();
    }

}
