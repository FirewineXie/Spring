package com.spring.di5;

import com.spring.lazy4.Duck;
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

//        System.out.println("------------------");
//        2.获取spring容器中创建的对象(通过ID值获取)
//        Duck duck = (Duck) context.getBean("bigduck");
        Cat cat1= (Cat) context.getBean("cat1");
        Cat cat2= (Cat) context.getBean("cat2");


        System.out.println(cat2);

//
//
//        duck.behavior();

    }
}
