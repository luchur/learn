package com.learn.test.designmode.templete;

/**
 * Created by luchuang on 2018/5/18.
 * 模板方法模式
 */
public abstract class AbstractCarModel {

    protected abstract void start();
    protected abstract void alert();
    protected abstract void stop();

    //不允许修改
    final public void run(){
        start();

        if(this.isAlert()){
            alert();
        }

        stop();
    }

    //钩子方法,alert()方法是否执行标志
    protected boolean isAlert(){
        return true;
    }
}
