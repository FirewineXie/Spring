package com.spring.annotation.mvc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-10-17:37
 * @Description :  <br/>
 */
public class Window {

    public static void main(String[] args) {

//        FrontServlet frontServlet = new FrontServlet();
//
//        frontServlet.doGet();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        FrontServlet fs = (FrontServlet) applicationContext.getBean("frontServlet");

        fs.doGet();
    }
}
