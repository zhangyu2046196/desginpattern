package com.youyuan.decorator;

/**
 * @author zhangy
 * @version 1.0
 * @description 客户端
 * @date 2019/12/2 9:05
 */
public class DecoratorBar {

    public static void main(String[] args) {
        //测试订购2份巧克力+1份牛奶的LongBlack(美式咖啡),在订购过程中是通过递归的方式订购

        //1、美式咖啡
        Drink order = new LongBlack();
        System.out.println("费用1：" + order.cost() + " 描述1：" + order.getDes());

        //2、1份牛奶
        order = new Milk(order);
        System.out.println("费用2：" + order.cost() + " 描述2：" + order.getDes());

        //3、1份巧克力
        order = new Chocolate(order);
        System.out.println("费用3：" + order.cost() + " 描述3：" + order.getDes());

        //4、1份巧克力
        order = new Chocolate(order);
        System.out.println("费用4：" + order.cost() + " 描述4：" + order.getDes());
    }

}
