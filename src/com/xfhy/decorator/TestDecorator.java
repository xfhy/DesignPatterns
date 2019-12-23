package com.xfhy.decorator;

/**
 * @author : xfhy
 * Create time : 2019/12/23 23:08
 * Description :
 */
class TestDecorator {

    public static void main(String[] args) {
        Person person = new Person("小菜");
        System.out.println("第一种装扮");

        BigTrouser bigTrouser = new BigTrouser();
        LeatherShoes leatherShoes = new LeatherShoes();
        TShirts tShirts = new TShirts();

        bigTrouser.setDecorate(person);
        leatherShoes.setDecorate(bigTrouser);
        tShirts.setDecorate(leatherShoes);
        tShirts.show();
    }

}
