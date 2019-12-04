package com.youyuan.state;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/4 12:03
 */
public class Client {

    public static void main(String[] args) {
        //设置活动的奖品数量为1
        Activity activity = new Activity(1);
        //模拟领取30次奖品
        for (int i = 1; i <= 30; i++) {
            System.out.println("======这是第" + i + "次领取奖品======");
            //第一步扣积分
            activity.debuctMoney();
            //第二步领奖
            activity.raffle();
        }
    }

}
