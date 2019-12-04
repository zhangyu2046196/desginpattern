package com.youyuan.prototype.deepclone;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试深克隆
 * @date 2019/11/28 9:53
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
//        DeepPrototype deepPrototype = new DeepPrototype("jemery", 20, new DeepCloneTarget("上海"));
//        System.out.println("被克隆的对象:" + deepPrototype.toString() + " DeepCloneTarget hashCode:" + deepPrototype.getDeepCloneTarget().hashCode());
//        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype.clone();
//        System.out.println("克隆后的对象:" + deepPrototype2.toString() + " DeepCloneTarget hashCode:" + deepPrototype2.hashCode());

        DeepPrototype deepPrototype = new DeepPrototype("jemery", 20, new DeepCloneTarget("上海"));
        System.out.println("被克隆的对象:" + deepPrototype.toString() + " DeepCloneTarget hashCode:" + deepPrototype.getDeepCloneTarget().hashCode());
        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype.deepClone();
        System.out.println("克隆后的对象:" + deepPrototype2.toString() + " DeepCloneTarget hashCode:" + deepPrototype2.hashCode());


    }

}
