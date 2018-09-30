package com.xfhy;

import com.xfhy.product.Computer;

/**
 * author feiyang
 * create at 2018/9/19 14:48
 * description：
 */
public class GDComputerFactory extends ComputerFactory {

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        String name = clz.getName();
        Computer computer = null;
        try {
            //通过反射来生产不用厂家的计算机
            computer = (Computer) Class.forName(name).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) computer;
    }
}
