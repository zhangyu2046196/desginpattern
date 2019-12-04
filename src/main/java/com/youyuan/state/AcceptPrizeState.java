package com.youyuan.state;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—状态模式
 * <p>
 * 领奖状态
 * @date 2019/12/4 11:55
 */
public class AcceptPrizeState implements State {

    private Activity activity;

    public AcceptPrizeState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣减过积分");
    }

    @Override
    public boolean rafflePrize() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void getPrize() {
        if (activity.getCount() > 0) {
            System.out.println("领取奖品成功");
            activity.setState(activity.getNoRafflePrizeState());
        } else {
            System.out.println("抱歉，奖品已发放完，参加下次活动");
            activity.setState(activity.getNoPrizeState());
        }
    }
}
