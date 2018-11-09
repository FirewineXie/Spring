package com.spring.di5;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-09-15:59
 */
public class Cat {

    private String name; //猫名

    private Integer age ; //年龄

    private Float weight; // 体重

    public Cat(String name, Integer age, Float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("有参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Cat() {
        System.out.println("无参构造方法");
    }
}
