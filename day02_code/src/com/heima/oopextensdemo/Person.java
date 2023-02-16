package com.heima.oopextensdemo;

public class Person {
    // 1、成员变量
    // 2、构造函数（空参构造、非空参构造）
    // 3、成员方法
    private String ID;
    private String name;
    private String salary;


    public Person() {
    }

    public Person(String ID, String name, String salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public void work(){
        System.out.println("某人正在工作");
    }

    public void eat(){
        System.out.println("正在吃米饭");
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
