package com.youyuan.command;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—命令模式
 * <p>
 * 电灯关闭命令
 * @date 2019/12/4 8:25
 */
public class OffLightCommand implements Command {
    private LightRevice lightRevice;

    public OffLightCommand(LightRevice lightRevice) {
        this.lightRevice = lightRevice;
    }

    @Override
    public void execute() {
        lightRevice.off();
    }

    @Override
    public void undo() {
        lightRevice.on();
    }
}
