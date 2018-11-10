package com.spring.aop2;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-10-14:25
 */

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 判断用户名与密码是否正确
 * username = admin
 * password  =123
 */
public class Auth {
    private String username = "admin";

    private String password ="123";

    public void isUserExist(ProceedingJoinPoint pp) throws Throwable {
        if ("admin".equals(username) && "123".equals(password)){
            //放行
            pp.proceed();
        }else {
            //不容许
            System.out.println("登录错误");
        }
    }
}
