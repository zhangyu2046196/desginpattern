package com.youyuan.template;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/3 21:04
 */
public class Client {

    public static void main(String[] args) {
        //红豆豆浆
        SoyaMilk ormosiaSoyaMilk = new OrmosiaSoyaMilk();
        System.out.println("==========制作红豆豆浆过程==========");
        ormosiaSoyaMilk.make();

        //花生豆浆
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        System.out.println("==========制作花生豆浆过程==========");
        peanutSoyaMilk.make();

        //纯豆浆
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        System.out.println("==========制作纯豆浆过程==========");
        pureSoyaMilk.make();
    }

}
