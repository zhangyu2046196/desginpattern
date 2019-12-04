package com.youyuan.proxy.jdkproxy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—结构型—代理模式—jdk动态代理
 * <p>
 * 接口 jdk动态代理中目标类需要实现接口，代理类不需要实现接口，代理类通过jdk的api利用反射技术在jvm内存中动态构建
 * @date 2019/12/3 10:11
 */
public interface ITeacherDao {

    public void teach();
}
