package com.youyuan.princple.inversion.improve;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试依赖传递方式之setter方法依赖传递
 * <p>
 * 1、接口传递
 * 2、构造方法传递
 * 3、setter方法传递
 * @date 2019/11/20 11:08
 */
public class DependencePass3 {

    public static void main(String[] args) {
        ITV3 changhong = new ChangHong3();
        OpenAndClose3 iOpenAndClose3 = new OpenAndClose3();
        iOpenAndClose3.setItv3(changhong);
        iOpenAndClose3.open();
    }

}

interface ITV3 {
    public void play();
}

/**
 * 接口传递依赖
 */
interface IOpenAndClose3 {
    public void open();
}

/**
 * 依赖的对象
 */
class ChangHong3 implements ITV3 {
    @Override
    public void play() {
        System.out.println("长虹电视播放节目");
    }
}

/**
 * 原对象，此对象依赖ITV的对象
 */
class OpenAndClose3 implements IOpenAndClose3 {

    private ITV3 itv3;

    public void setItv3(ITV3 itv3) {
        this.itv3 = itv3;
    }

    @Override
    public void open() {
        itv3.play();
    }
}
