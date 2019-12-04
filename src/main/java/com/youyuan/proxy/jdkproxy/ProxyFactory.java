package com.youyuan.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangy
 * @version 1.0
 * @description 代理工厂
 * @date 2019/12/3 10:13
 */
public class ProxyFactory {
    /**
     * 目标类接口
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 利用jdk的反射构建代理对象
     *
     * @return
     */
    public Object getInstanceProxy() {
        //ClassLoader loader,Class<?>[] interfaces,InvocationHandler h
        // loader：目标对象实现接口的类加载器
        // interfaces：目标对象实现接口的class数组
        // h：调用处理器，用于执行目标对象的方法
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk动态代理调用目标方法之前");
                //调用目标方法的返回值
                Object returnVal = method.invoke(target, args);
                System.out.println("jdk动态代理调用目标方法之后");
                return returnVal;
            }
        });
    }
}
