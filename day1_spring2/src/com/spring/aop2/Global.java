package com.spring.aop2;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-10-15:50
 * @Description :  统一异常处理<br/>
 */
public class Global {
    /**
     * 如果是上限的，是记录日志，并且跳转到指定页面
     */
    public void hanExpt(Throwable ex){
        System.out.println("我出错了");
    }
}
