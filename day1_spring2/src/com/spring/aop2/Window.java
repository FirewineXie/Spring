package com.spring.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-09-19:29
 */
public class Window {

    public static void main(String[] args) {
//        BanServiceProxy  banServiceProxy = new BanServiceProxy();
//
//        banServiceProxy.chaMoney();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BankServiceImpl bankService = (BankServiceImpl) applicationContext.getBean("bankServiceImpl");

        bankService.getMoney();
    }
}
