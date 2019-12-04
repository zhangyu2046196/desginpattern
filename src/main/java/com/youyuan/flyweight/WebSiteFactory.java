package com.youyuan.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangy
 * @version 1.0
 * @description 站点工厂
 * @date 2019/12/2 21:14
 */
public class WebSiteFactory {
    private Map<String, WebSite> factory = new HashMap<String, WebSite>();

    /**
     * 获取站点
     *
     * @param type
     * @return
     */
    public WebSite getWebSiteByType(String type) {
        if (!factory.containsKey(type)) {
            factory.put(type, new ConcretorWebSite(type));
        }
        return factory.get(type);
    }

    /**
     * 获取集合站点数量
     * @return
     */
    public int getWebSiteSize(){
        return factory.size();
    }
}
