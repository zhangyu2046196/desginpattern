package com.youyuan.bridge;

/**
 * @author zhangy
 * @version 1.0
 * @description 客户端
 * @date 2019/11/28 18:30
 */
public class Phone {

    public static void main(String[] args) {
        RenovatePhone renovatePhone = new RenovatePhone(new XiaoMi());
        renovatePhone.open();
        renovatePhone.close();
        renovatePhone.call();

        UprightPhone uprightPhone = new UprightPhone(new Vivo());
        uprightPhone.open();
        uprightPhone.close();
        uprightPhone.call();
    }

}
