package com.youyuan.command;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—命令模式
 * <p>
 * 电灯打开命令
 * @date 2019/12/4 8:23
 */
public class OnLightCommand implements Command {
    private LightRevice lightRevice;

    public OnLightCommand(LightRevice lightRevice) {
        this.lightRevice = lightRevice;
    }

    @Override
    public void execute() {
        lightRevice.on();
    }

    @Override
    public void undo() {
        lightRevice.off();
    }
}
