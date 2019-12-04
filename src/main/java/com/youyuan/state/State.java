package com.youyuan.state;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—状态模式
 * <p>
 * 状态接口
 * @date 2019/12/4 11:47
 */
public interface State {
    /**
     * 扣积分
     */
    public abstract void deductMoney();

    /**
     * 抽奖
     *
     * @return
     */
    public abstract boolean rafflePrize();

    /**
     * 领奖品
     */
    public abstract void getPrize();

}
