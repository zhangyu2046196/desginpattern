package com.youyuan.princple.ocp;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试违反开闭原则的
 * <p>
 * 概念：开闭原则是最基础最重要的设计原则，扩展开放，修改关闭，用抽象定义框架，用实现定义细节
 * @date 2019/11/20 17:08
 */
public class Ocp {

    public static void main(String[] args) {
        Quadrate quadrate = new Quadrate(1);
        Circle circle = new Circle(2);
        DrawSharp drawSharp = new DrawSharp();
        drawSharp.draw(quadrate);
        drawSharp.draw(circle);
    }

}

/**
 * 画图的基类
 */
class Sharp {
    public int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

/**
 * 画图工具类
 */
class DrawSharp {
    public void draw(Sharp sharp) {
        if (sharp.getType() == 1) {  //正方形
            drawQuadrate();
        } else if (sharp.getType() == 2) {  //圆形  新增圆形时需要增加判断违反了开闭原则
            drawCircle();
        }
    }

    private void drawQuadrate() {
        System.out.println("画正方形");
    }

    private void drawCircle() {
        System.out.println("画圆形");
    }
}

/**
 * 正方形
 */
class Quadrate extends Sharp {
    public Quadrate(int type) {
        this.type = type;
    }
}

/**
 * 新增圆形时需要修改的地方
 * 1、增加一个类
 * 2、在DrawSharp工具类中增加画圆的方法和增加if else 判断
 */
class Circle extends Sharp {
    public Circle(int type) {
        this.type = type;
    }
}
