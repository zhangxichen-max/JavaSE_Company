package com.heima.polymorPhism;

public class Animal {
    // 定义成员变量
    private String color;
    private int age;

    // 空参构造方法
    public Animal(){

    }

    // 实参构造方法
    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    // 相应的get与set方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String something){
        System.out.println("在吃" + something);
    }


}
