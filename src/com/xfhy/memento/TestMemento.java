package com.xfhy.memento;

/**
 * @author : xfhy
 * Create time : 2019/12/30 22:37
 * Description :
 */
class TestMemento {

    public static void main(String[] args) {
        Dema dema = new Dema();
        dema.init();
        dema.stateDisplay();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(dema.saveState());

        //打boss
        dema.fight();
        dema.stateDisplay();

        //恢复之前状态
        dema.recoveryState(roleStateCaretaker.getMemento());
        dema.stateDisplay();
    }
}
