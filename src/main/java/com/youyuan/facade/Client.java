package com.youyuan.facade;

/**
 * @author zhangy
 * @version 1.0
 * @description 客户端
 * @date 2019/12/2 17:32
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println("========准备========");
        homeTheaterFacade.ready();
        System.out.println("========播放========");
        homeTheaterFacade.play();
        System.out.println("========关闭========");
        homeTheaterFacade.end();
    }

}
