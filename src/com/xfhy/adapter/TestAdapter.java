package com.xfhy.adapter;

/**
 * @author : xfhy
 * Create time : 2019/12/27 22:23
 * Description :
 */
class TestAdapter {

    public static void main(String[] args) {
        Player player1 = new Translator("姚明");
        player1.attack();
        player1.defense();

        Player player2 = new Forwards("巴蒂尔");
        player2.attack();
        player2.defense();

        Player player3 = new Guards("麦格尔");
        player3.attack();
        player3.defense();
    }

}
