package com.youyuan.flyweight;

/**
 * @author zhangy
 * @version 1.0
 * @description 具体的站点
 * @date 2019/12/2 21:13
 */
public class ConcretorWebSite extends WebSite {
    /**
     * 站点类型   内部状态
     */
    private String type;

    public ConcretorWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(type + "站点,用户" + user.getName());
    }
}
