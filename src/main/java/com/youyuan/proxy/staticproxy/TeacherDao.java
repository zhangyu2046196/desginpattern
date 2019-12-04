package com.youyuan.proxy.staticproxy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—结构型—代理模式—静态代理
 * <p>
 * 目标对象
 * @date 2019/12/3 9:11
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("开始教学了.....");
    }
}
