package com.youyuan.template;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—模板模式
 * <p>
 * 豆浆制作抽象类
 * @date 2019/12/3 20:56
 */
public abstract class SoyaMilk {

    public ThreadLocal<Boolean> isResume = new ThreadLocal<>();

    /**
     * 制作豆浆过程方法  定义为final类型防止子类重写
     */
    public final void make() {
        isResume.set(Boolean.TRUE);
        select();
        System.out.println("第一步:" + isResume.get());
        if (isAddIngredients()) {
            addIngredients();
        }
        soak();
        System.out.println("第二步:" + isResume.get());
        breakSoya();
    }

    /**
     * 选材
     */
    public void select() {
        System.out.println("select");
        if (isResume.get()){
            System.out.println("第一步：选择好黄豆");
        }
    }

    /**
     * 添加口味配料 由子类实现
     */
    public abstract void addIngredients();

    /**
     * 浸泡
     */
    public void soak() {
        System.out.println("soak");
        if (isResume.get()) {
            System.out.println("第二步：浸泡黄豆和口味配料");
        }
    }

    /**
     * 打碎
     */
    public void breakSoya() {
        System.out.println("breakSoya");
        if (isResume.get()){
            System.out.println("第三步：把黄豆和配料打碎");
        }
    }

    /**
     * 钩子方法，是否添加配料
     *
     * @return true 添加  false不添
     */
    public boolean isAddIngredients() {
        return true;
    }

}
