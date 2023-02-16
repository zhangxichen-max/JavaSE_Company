package com.heima.polymorPhism;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
