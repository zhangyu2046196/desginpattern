package com.youyuan.flyweight;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/2 21:17
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWebSiteByType("新闻");
        webSite1.use(new User("tom"));

        WebSite webSite2 = factory.getWebSiteByType("博客");
        webSite2.use(new User("jack"));

        WebSite webSite3 = factory.getWebSiteByType("博客");
        webSite3.use(new User("simth"));

        WebSite webSite4 = factory.getWebSiteByType("博客");
        webSite4.use(new User("lili"));

        WebSite webSite5 = factory.getWebSiteByType("博客");
        webSite5.use(new User("pit"));

        WebSite webSite6 = factory.getWebSiteByType("博客");
        webSite6.use(new User("wsty"));

        int webSiteSize = factory.getWebSiteSize();
        System.out.println("站点数量值:" + webSiteSize);

    }

}
