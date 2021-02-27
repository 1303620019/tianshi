package com.tian.cn;

/**
 * @Author: 007
 * @Date: 2019/1/27/0027 10:20
 * @Version 1.0
 * @Description: 创建测试用的bean
 */
public class Person {
    private String name;        //姓名代号
    private int age;            //年龄

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}