package com.spring.annotation.ioc1;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-10-16:51
 * @Description :  <br/>
 */
@Component("duck")
public class Duck {
    private String duckName = "唐老鸭";

    private Integer age = 20;

    public String getDuckName() {
        return duckName;
    }

    public void setDuckName(String duckName) {
        this.duckName = duckName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "duckName='" + duckName + '\'' +
                ", age=" + age +
                '}';
    }
}
