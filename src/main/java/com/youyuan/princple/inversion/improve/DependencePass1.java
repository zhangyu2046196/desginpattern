package com.youyuan.princple.inversion.improve;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试依赖传递方式之接口依赖传递
 * <p>
 * 1、接口传递
 * 2、构造方法传递
 * 3、setter方法传递
 * @date 2019/11/20 11:08
 */
public class DependencePass1 {

    public static void main(String[] args) {
        IOpenAndClose openAndClose = new OpenAndClose();
        ITV changHong = new ChangHong();
        openAndClose.open(changHong);
    }

}

interface ITV {
    public void play();
}

/**
 * 接口传递依赖
 */
interface IOpenAndClose {
    public void open(ITV itv);
}

/**
 * 依赖的对象
 */
class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视播放节目");
    }
}

/**
 * 原对象，此对象依赖ITV的对象
 */
class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV itv) {
        itv.play();
    }
}
