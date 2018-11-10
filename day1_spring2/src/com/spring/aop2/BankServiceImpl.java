package com.spring.aop2;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-09-18:14
 */
public class BankServiceImpl {
    private Security s = new Security();
    private Log log  = new Log();

    /**
     * Desciption: 查询余额
     */
    public int getMoney(){//高内聚，低耦合
        int i = 10 / 0 ;
        System.out.println("BankServiceImpl ........getMoney() ......" );
        return 500;
    }

    /**
     * Desciption： 转账
     */
    public String rendMoney(){
        System.out.println("BankServiceImpl ........rendMoney() ......");
        return "哈哈";
    }

    /**
     * Descption ： 投资理财
     */
    public float invest(){
        System.out.println("BankServiceImpl ........inverst() ......");
        return 3.14f;
    }


}
