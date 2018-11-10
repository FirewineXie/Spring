package com.spring.annotation.ioc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-10-16:12
 * @Description :  <br/>
 */
@Component(value = "bigji")//<bean id = bigji>
//@Scope(value = "singleton")//等价于xml配置文件里写的
public class ji {

//    @Resource(name = "duck")
    @Autowired // 自动捆绑
    private Duck duck;
    public  void behavior(){
        System.out.println("打鸣  =" + duck);
    }
}
