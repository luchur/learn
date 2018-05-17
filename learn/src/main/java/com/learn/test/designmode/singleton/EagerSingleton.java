package com.learn.test.designmode.singleton;

/**
 * Created by luchuang on 2018/5/16.
 * 饿汉式
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return instance;
    }
}