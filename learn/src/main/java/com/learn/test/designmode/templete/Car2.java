package com.learn.test.designmode.templete;

/**
 * Created by luchuang on 2018/5/18.
 */
public class Car2 extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("Car2 start");
    }

    @Override
    protected void alert() {
        System.out.println("Car2 alert");
    }

    @Override
    protected void stop() {
        System.out.println("Car2 stop");
    }

    @Override
    protected boolean isAlert() {
        return false;
    }
}
