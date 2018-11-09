package com.spring.di1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-09-17:01
 */
public class Person {
    private String name;
    private List list;
    private Panda pet;
    private Set set;
    private Map map;

    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Panda getPet() {
        return pet;
    }

    public void setPet(Panda pet) {
        this.pet = pet;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Person(String name, List list, Panda pet, Set set, Map map, Properties properties) {
        this.name = name;
        this.list = list;
        this.pet = pet;
        this.set = set;
        this.map = map;
        this.properties = properties;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", list=" + list +
                ", pet=" + pet +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
