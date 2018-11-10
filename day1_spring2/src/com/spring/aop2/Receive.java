package com.spring.aop2;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-10-13:42
 */

/**
 * 用来接收目标方法返回值得切面
 */
public class Receive {
    public void printMoney(Object m){
        System.out.println("当前返回的余额： " + m);

    }
}
