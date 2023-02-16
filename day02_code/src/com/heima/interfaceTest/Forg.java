package com.heima.interfaceTest;

public class Forg extends Animal implements swim{

    public Forg() {
    }

    public Forg(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }
}
