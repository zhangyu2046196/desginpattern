package com.youyuan.command;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/4 8:34
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=======初始化命令路由=======");
        LightRevice lightRevice = new LightRevice();
        Command onLightCommand = new OnLightCommand(lightRevice);
        Command offLightCommand = new OffLightCommand(lightRevice);

        RemoteCommand remoteCommand = new RemoteCommand();
        remoteCommand.setCommand(0, onLightCommand, offLightCommand);

        System.out.println("========电灯打开=========");
        remoteCommand.on(0);
        System.out.println("========电灯关闭=========");
        remoteCommand.off(0);
        System.out.println("========电灯撤销=========");
        remoteCommand.undo();
    }

}
