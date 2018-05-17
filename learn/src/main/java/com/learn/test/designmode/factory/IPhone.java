package com.learn.test.designmode.factory;

/**
 * Created by luchuang on 2018/5/17.
 */
public class IPhone implements Phone {
    @Override
    public void sendMessage() {
        System.out.println("iPhone send Msg");
    }
}
