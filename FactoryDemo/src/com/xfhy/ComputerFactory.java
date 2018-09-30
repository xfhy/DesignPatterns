package com.xfhy;

import com.xfhy.product.Computer;

/**
 * author feiyang
 * create at 2018/9/19 14:45
 * description：
 */
public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clz);
}
