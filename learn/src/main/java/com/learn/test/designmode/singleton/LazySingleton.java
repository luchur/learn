package com.learn.test.designmode.singleton;

/**
 * Created by luchuang on 2018/5/16.
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    //私有化构造器
    private LazySingleton(){}

    public static LazySingleton getintance() {
        System.out.println("11111111");
        //如果已实例化,不去再同步,节省性能
        if (instance == null) {
            System.out.println("2222222");
            //尽量缩小被同步的代码块
            synchronized (LazySingleton.class){
                System.out.println("3333333");
                if(instance == null){
                    System.out.println("4444444");
                    instance =  new LazySingleton();
                }
            }
        }

        return  instance;
    }
}
