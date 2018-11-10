package com.spring.annotation.mvc2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-10-17:30
 * @Description :  <br/>
 */
//@Component("frontDaoImpl")
@Repository
public class FrontDaoImpl {

    public void addUser(){
        System.out.println("添加成功");
    }
}
