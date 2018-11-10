package com.spring.annotation.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-10-17:35
 * @Description :  <br/>
 */
@Component("frontServlet")
public class FrontServlet {

    @Autowired
    private FrontServiceImpl frontService ;
    public void doGet(){
        frontService.useradd();
    }
    public void doPost(){
        doGet();
    }
}
