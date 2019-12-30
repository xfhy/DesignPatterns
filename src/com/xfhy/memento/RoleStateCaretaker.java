package com.xfhy.memento;

/**
 * @author : xfhy
 * Create time : 2019/12/30 22:33
 * Description : 保存状态
 */
class RoleStateCaretaker {

    private RoleStateMemento mMemento;

    public RoleStateMemento getMemento() {
        return mMemento;
    }

    public void setMemento(RoleStateMemento memento) {
        mMemento = memento;
    }
}
