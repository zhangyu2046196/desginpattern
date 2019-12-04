package com.youyuan.flyweight;

/**
 * @author zhangy
 * @version 1.0
 * @description  设计模式—结构型—享元模式
 *
 * 项目：小型的外包项目，给客户A做一个产品展示网站，客户A的朋友感觉效果不错，也希望做这样的产品展示网站，但是要求都有些不同：
 * 1.有客户要求以新闻的形式发布
 * 2.有客户要求以博客的形式发布
 * 3.有客户要求以微信公众号的形式发布
 *
 * @date 2019/12/2 21:10
 */
public abstract class WebSite {
    /**
     * 使用站点方法
     * @param user
     */
    public abstract void use(User user);
}
