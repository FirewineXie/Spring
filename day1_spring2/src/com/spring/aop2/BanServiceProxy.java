package com.spring.aop2;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-09-19:23
 *
 * 代理类，是合前面的包
 */
public class BanServiceProxy {

    private BankServiceImpl bankService = new BankServiceImpl();
    private Security security =  new Security();

    private Log log = new Log();
    private Clean clean = new Clean();

    public void chaMoney(){
        security.isSecurity();//首先检测安全
        bankService.getMoney();//业务
        log.log();//日志
        clean.ClearResource();//清空数据
    }

    public void touzi(){
        security.isSecurity();//首先检测安全
        bankService.rendMoney();//业务
        log.log();//日志
        clean.ClearResource();//清空数据
    }
    public void moneyZhuan(){
        security.isSecurity();//首先检测安全
        bankService.invest();//业务
        log.log();//日志
        clean.ClearResource();//清空数据
    }

}
