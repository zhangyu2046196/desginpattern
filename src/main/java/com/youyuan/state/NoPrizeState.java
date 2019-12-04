package com.youyuan.state;

/**
 * @author zhangy
 * @version 1.0
 * @description  设计模式—行为型—状态模式
 *
 * 奖品发完状态
 *
 * @date 2019/12/4 11:57
 */
public class NoPrizeState implements State {

    private Activity activity;

    public NoPrizeState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发完不能扣减积分");
    }

    @Override
    public boolean rafflePrize() {
        System.out.println("奖品发完不能抽奖");
        return false;
    }

    @Override
    public void getPrize() {
        System.out.println("奖品发完不能领取奖品");
    }
}
