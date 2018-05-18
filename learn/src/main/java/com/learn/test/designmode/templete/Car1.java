package com.learn.test.designmode.templete;

/**
 * Created by luchuang on 2018/5/18.
 */
public class Car1 extends AbstractCarModel {

    private boolean alertFlag = true;
    @Override
    protected void start() {
        System.out.println("Car1 start");
    }

    @Override
    protected void alert() {
        System.out.println("Car1 alert");
    }

    @Override
    protected void stop() {
        System.out.println("Car1 stop");
    }

    @Override
    protected boolean isAlert() {
        return this.alertFlag;
    }

    public void setAlertFlag(boolean isAlert){
        this.alertFlag = isAlert;
    }
}
