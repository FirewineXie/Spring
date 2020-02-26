package com.mvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-27-16:47
 * @Description :  <br/>
 */
@Controller
public class HelloWorld {

    /**
     * 1. 使用 @RequestMapping 注解来映射请求的 URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于 InternalResourceViewResolver 视图解析器, 会做如下的解析:
     * 通过 prefix + returnVal + 后缀 这样的方式得到实际的物理视图, 然会做转发操作
     *
     * /WEB-INF/views/success.jsp
     *
     * @return
     */
    @RequestMapping("/helloworld")
    public String helloworld(){
        System.out.println("hello world");
        return "success";
    }
}
