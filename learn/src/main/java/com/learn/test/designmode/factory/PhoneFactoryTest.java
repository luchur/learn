package com.learn.test.designmode.factory;

/**
 * Created by luchuang on 2018/5/17.
 */
public class PhoneFactoryTest {
    public static void main(String[] args) {
        IPhone iphone = PhoneFactory.createPhone(IPhone.class);
        Xiaomi xiaomi = PhoneFactory.createPhone(Xiaomi.class);
    }
}
