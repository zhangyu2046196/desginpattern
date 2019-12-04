package com.youyuan.command;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—命令模式
 * <p>
 * 命令接口
 * @date 2019/12/4 8:19
 */
public interface Command {
    /**
     * 执行
     */
    public void execute();

    /**
     * 撤销
     */
    public void undo();
}
