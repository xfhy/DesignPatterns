package com.xfhy.adapter;

/**
 * @author : xfhy
 * Create time : 2019/12/27 22:25
 * Description :
 */
class Translator extends Player {

    private ForeignCenter mForeignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        mForeignCenter.name = name;
    }


    @Override
    public void attack() {
        mForeignCenter.attack();
    }

    @Override
    public void defense() {
        mForeignCenter.defense();
    }
}
