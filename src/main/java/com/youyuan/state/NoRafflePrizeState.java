package com.youyuan.state;

/**
 * @author zhangy
 * @version 1.0
 * @description  设计模式—行为型—状态模式
 *
 * 不能领奖状态
 *
 * @date 2019/12/4 11:48
 */
public class NoRafflePrizeState implements State {

    private Activity activity;

    public NoRafflePrizeState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除积分成功!");
        activity.setState(activity.getCanRafflePrizeState());
    }

    @Override
    public boolean rafflePrize() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void getPrize() {
        System.out.println("不能领奖品");
    }
}
