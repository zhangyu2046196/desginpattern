package com.youyuan.state;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—状态模式
 * <p>
 * 活动
 * @date 2019/12/4 11:49
 */
public class Activity {
    //当前状态
    private State state;
    //不能领奖状态
    private State noRafflePrizeState = new NoRafflePrizeState(this);
    //能领奖状态
    private State canRafflePrizeState = new CanRafflePrizeState(this);
    //领奖状态
    private State acceptPrizeState = new AcceptPrizeState(this);
    //奖品领完状态
    private State noPrizeState = new NoPrizeState(this);

    /**
     * 奖品数量
     */
    private int count;

    public Activity(int count) {
        this.setState(this.getNoRafflePrizeState());
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int currentCount=count;
        count--;
        return currentCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflePrizeState() {
        return noRafflePrizeState;
    }

    public void setNoRafflePrizeState(State noRafflePrizeState) {
        this.noRafflePrizeState = noRafflePrizeState;
    }

    public State getCanRafflePrizeState() {
        return canRafflePrizeState;
    }

    public void setCanRafflePrizeState(State canRafflePrizeState) {
        this.canRafflePrizeState = canRafflePrizeState;
    }

    public State getAcceptPrizeState() {
        return acceptPrizeState;
    }

    public void setAcceptPrizeState(State acceptPrizeState) {
        this.acceptPrizeState = acceptPrizeState;
    }

    public State getNoPrizeState() {
        return noPrizeState;
    }

    public void setNoPrizeState(State noPrizeState) {
        this.noPrizeState = noPrizeState;
    }

    //扣分, 调用当前状态的 deductMoney
    public void debuctMoney(){
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
        // 如果当前的状态是抽奖成功
        if(state.rafflePrize()){
            //领取奖品
            state.getPrize();
        }

    }
}
