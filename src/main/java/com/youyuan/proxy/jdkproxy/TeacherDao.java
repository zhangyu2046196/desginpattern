package com.youyuan.proxy.jdkproxy;

/**
 * @author zhangy
 * @version 1.0
 * @description  目标类
 * @date 2019/12/3 10:12
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("正在教学中.....");
    }
}
