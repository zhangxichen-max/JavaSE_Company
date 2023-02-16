package com.heima.polymorPhism;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    public void catchMouse(){
        System.out.println("猫在捉老鼠");
    }
}
