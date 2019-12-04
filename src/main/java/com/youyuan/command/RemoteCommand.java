package com.youyuan.command;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—命令模式
 * <p>
 * 命令路由
 * @date 2019/12/4 8:26
 */
public class RemoteCommand {
    /**
     * 智能家电打开命令集合
     */
    private Command[] onCommands;
    /**
     * 智能家电关闭命令集合
     */
    private Command[] offCommands;
    /**
     * 空命令记录上次命令
     */
    private Command unCommand;

    public RemoteCommand() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        this.unCommand = new UnCommand();
    }

    /**
     * 初始化命令集合
     *
     * @param number
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int number, Command onCommand, Command offCommand) {
        onCommands[number] = onCommand;
        offCommands[number] = offCommand;
    }

    /**
     * 打开命令
     *
     * @param number
     */
    public void on(int number) {
        //打开命令执行
        onCommands[number].execute();
        //记录当前命令，用于撤销操作
        unCommand = onCommands[number];
    }

    /**
     * 关闭命令
     *
     * @param number
     */
    public void off(int number) {
        //关闭命令执行
        offCommands[number].execute();
        //记录当前命令,用于撤销操作
        unCommand = offCommands[number];
    }

    /**
     * 撤销命令
     */
    public void undo() {
        unCommand.undo();
    }
}
