package com.spring.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-08-20:16
 */
public class Window {

    public static void main(String[] args) {
//        YelloMouseWolf yelloMouseWolf = new YelloMouseWolf();
//
//        yelloMouseWolf.bahavior();


//        1.启动框架（Context 代表spring）
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2.获取spring容器中创建的对象(通过ID值获取)
        Person person = (Person) context.getBean("person");
        System.out.println(person);


    }
}