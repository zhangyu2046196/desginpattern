package com.youyuan.prototype.deepclone;

import java.io.*;

/**
 * @author zhangy
 * @version 1.0
 * @description 深克隆对象
 * @date 2019/11/28 9:49
 */
public class DeepPrototype implements Serializable, Cloneable {
    private static final long serialVersionUID = 2290137697098125442L;

    private String name;

    private int age;

    private DeepCloneTarget deepCloneTarget;

    public DeepPrototype(String name, int age, DeepCloneTarget deepCloneTarget) {
        this.name = name;
        this.age = age;
        this.deepCloneTarget = deepCloneTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeepCloneTarget getDeepCloneTarget() {
        return deepCloneTarget;
    }

    public void setDeepCloneTarget(DeepCloneTarget deepCloneTarget) {
        this.deepCloneTarget = deepCloneTarget;
    }

    /**
     * 深克隆方式1  通过重写clone方式
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepPrototype deepPrototype = (DeepPrototype) super.clone();
        deepPrototype.setDeepCloneTarget(new DeepCloneTarget("北京"));
        return deepPrototype;
    }

    /**
     * 深克隆方式2  通过序列化方式
     *
     * @return
     */
    public DeepPrototype deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            return (DeepPrototype) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deepCloneTarget=" + deepCloneTarget +
                '}';
    }
}
