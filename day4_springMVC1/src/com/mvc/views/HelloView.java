package com.mvc.views;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-29-16:03
 * @Description :  <br/>
 */
@Component
public class HelloView implements View {
    @Override
    public String getContentType() {

        return "text/html";
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {

        httpServletResponse.getWriter().print("hello view name  :" +new Date());
    }
}
