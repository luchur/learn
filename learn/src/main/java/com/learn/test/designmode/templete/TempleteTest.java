package com.learn.test.designmode.templete;

/**
 * Created by luchuang on 2018/5/18.
 */
public class TempleteTest {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Car2 car2 = new Car2();

        //根据业务自主判断是否alert
        car1.setAlertFlag(false);

        car1.run();
        car2.run();
    }
}
