package com.learn.test.designmode.factory;

/**
 * Created by luchuang on 2018/5/17.
 */
public class PhoneFactory {
    public static  <T extends Phone> T createPhone(Class<T> c){
        Phone phone = null;
        try {
            phone = (Phone) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("send msg error");
        }
        return (T)phone;
    }

}
