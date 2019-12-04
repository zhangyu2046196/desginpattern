package com.youyuan.prototype.deepclone;

import java.io.Serializable;

/**
 * @author zhangy
 * @version 1.0
 * @description  深克隆需要引用的类
 * @date 2019/11/28 9:47
 */
public class DeepCloneTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = -4609035521445627309L;

    private String name;

    public DeepCloneTarget(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeepCloneTarget{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
