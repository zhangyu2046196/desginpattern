package com.youyuan.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangy
 * @version 1.0
 * @description 代理工厂
 * @date 2019/12/3 11:37
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 目标对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 构建代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        //1、创建工具类
        Enhancer enhancer = new Enhancer();
        //2、设置父类，因为cglib产生的代理类对象是目标类的子类，所以设置父类为目标类
        enhancer.setSuperclass(target.getClass());
        //3、设置回调函数
        enhancer.setCallback(this);
        //4、构建代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept方法用于执行目标对象的方法
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理执行目标方法 之前");
        Object returnVal = method.invoke(target, objects);
        System.out.println("cglib代理执行目标方法 之后");
        return returnVal;
    }
}
