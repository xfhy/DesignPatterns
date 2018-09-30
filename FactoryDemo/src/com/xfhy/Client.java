package com.xfhy;

import com.xfhy.product.DEComputer;
import com.xfhy.product.HPComputer;
import com.xfhy.product.LXComputer;

/**
 * author feiyang
 * create at 2018/9/19 14:51
 * description：
 */
public class Client {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new GDComputerFactory();

        LXComputer lxComputer = computerFactory.createComputer(LXComputer.class);
        lxComputer.start();

        HPComputer hpComputer = computerFactory.createComputer(HPComputer.class);
        hpComputer.start();

        DEComputer deComputer = computerFactory.createComputer(DEComputer.class);
        deComputer.start();

    }
}
