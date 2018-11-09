package com.spring.initAndDestroy3;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-08-20:54
 */
public class ji {

    public ji() {
        System.out.println("小鸡出生了");
    }

    public void init(){
        System.out.println("ji ........我是初始化");
    }
    public  void behavior(){
        System.out.println("鸡会打鸣");
    }
    public void  destroy(){
        System.out.println("ji........挂了");
    }
}
