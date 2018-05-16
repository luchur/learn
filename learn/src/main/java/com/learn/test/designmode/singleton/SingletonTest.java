package com.learn.test.designmode.singleton;

/**
 * Created by luchuang on 2018/5/16.
 */
public class SingletonTest {

    public static void main(String[] args) {

        LazySingleton lazySingleton1 = LazySingleton.getintance();
        System.out.println("第二个");
        LazySingleton lazySingleton2 = LazySingleton.getintance();

       // System.out.println(instance1==instance2);
    }
}


