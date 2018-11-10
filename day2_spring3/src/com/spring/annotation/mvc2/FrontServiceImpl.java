package com.spring.annotation.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-10-17:32
 * @Description :  <br/>
 */
//@Component("frontServiceImpl")
@Service
public class FrontServiceImpl {


    @Autowired
    private FrontDaoImpl frontDao ;
    public void useradd(){
        frontDao.addUser();
    }
}
