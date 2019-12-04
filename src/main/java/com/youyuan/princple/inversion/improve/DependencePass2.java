package com.youyuan.princple.inversion.improve;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试依赖传递方式之构造方法依赖传递
 * <p>
 * 1、接口传递
 * 2、构造方法传递
 * 3、setter方法传递
 * @date 2019/11/20 11:08
 */
public class DependencePass2 {

    public static void main(String[] args) {
        ITV2 changHong = new ChangHong2();
        IOpenAndClose2 openAndClose = new OpenAndClose2(changHong);
        openAndClose.open();
    }

}

interface ITV2 {
    public void play();
}

/**
 * 接口传递依赖
 */
interface IOpenAndClose2 {
    public void open();
}

/**
 * 依赖的对象
 */
class ChangHong2 implements ITV2 {
    @Override
    public void play() {
        System.out.println("长虹电视播放节目");
    }
}

/**
 * 原对象，此对象依赖ITV的对象
 */
class OpenAndClose2 implements IOpenAndClose2 {

    private ITV2 itv2;

    public OpenAndClose2(ITV2 itv2) {
        this.itv2 = itv2;
    }

    @Override
    public void open() {
        itv2.play();
    }
}
