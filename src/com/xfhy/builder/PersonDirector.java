package com.xfhy.builder;

/**
 * Created by xfhy on 2019/12/26 19:21
 * Description :
 */
class PersonDirector {

    private PersonBuilder mPersonBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        mPersonBuilder = personBuilder;
    }

    public void createPerson() {
        mPersonBuilder.buildHead();
        mPersonBuilder.buildBody();
        mPersonBuilder.buildArm();
        mPersonBuilder.buildLeg();
    }

}
