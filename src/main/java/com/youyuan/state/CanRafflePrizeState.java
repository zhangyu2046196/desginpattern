package com.youyuan.state;

import java.util.Random;

/**
 * @author zhangy
 * @version 1.0
 * @description  设计模式—行为型—状态模式
 *
 * 能领奖品状态
 *
 * @date 2019/12/4 11:52
 */
public class CanRafflePrizeState implements State {

    private Activity activity;

    public CanRafflePrizeState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣减过积分");
    }

    @Override
    public boolean rafflePrize() {
        int n= new Random().nextInt(10);
        if (n==0){
            System.out.println("恭喜您中奖");
            activity.setState(activity.getAcceptPrizeState());
            return true;
        }else {
            System.out.println("很遗憾，未中奖");
            activity.setState(activity.getNoRafflePrizeState());
            return false;
        }
    }

    @Override
    public void getPrize() {
        System.out.println("不能领奖品");
    }
}
