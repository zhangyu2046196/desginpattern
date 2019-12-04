package com.youyuan.factory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhangy
 * @version 1.0
 * @description 模拟客户端订购pizza
 * @date 2019/11/27 11:42
 */
public class PizzaStore {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入地区");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        if (s.equals("bj")){
            BJOrderPizza bjOrderPizza = new BJOrderPizza();
        }else if (s.equals("ld")){
            LDOrderPizza ldOrderPizza = new LDOrderPizza();
        }

    }

}
