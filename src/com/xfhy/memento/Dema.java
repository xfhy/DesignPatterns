package com.xfhy.memento;

/**
 * @author : xfhy
 * Create time : 2019/12/30 22:35
 * Description :
 */
class Dema {

    private int vit;
    private int atk;
    private int def;

    //保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    //恢复角色状态
    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void init() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }


    public void stateDisplay() {
        System.out.println("Dema{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                "}");
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
}
