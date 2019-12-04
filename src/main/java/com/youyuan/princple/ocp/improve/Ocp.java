package com.youyuan.princple.ocp.improve;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试遵循开闭原则
 * <p>
 * 概念：开闭原则是最基础最重要的设计原则，扩展开放，修改关闭，用抽象定义框架，用实现定义细节
 * @date 2019/11/20 17:08
 */
public class Ocp {

    public static void main(String[] args) {
        Quadrate quadrate = new Quadrate();
        Circle circle = new Circle();
        DrawSharp drawSharp = new DrawSharp();
        drawSharp.draw(quadrate);
        drawSharp.draw(circle);
    }

}

/**
 * 画图的基类
 */
abstract class Sharp {

    public abstract void draw();

}

/**
 * 画图工具类
 */
class DrawSharp {
    public void draw(Sharp sharp) {
        sharp.draw();
    }
}

/**
 * 正方形
 */
class Quadrate extends Sharp {
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}

/**
 * 遵循开闭原则的情况下新增圆形时需要修改的地方
 * 1、增加一个类
 */
class Circle extends Sharp {

    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
