package com.youyuan.proxy.staticproxy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—结构型—代理模式—静态代理
 * <p>
 * 代理对象
 * @date 2019/12/3 9:12
 */
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("执行目标方法前");
        teacherDao.teach();
        System.out.println("执行目标方法后");
    }
}
