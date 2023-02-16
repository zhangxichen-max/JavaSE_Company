package com.heima.interfaceTest;

public class Test {

    public static void main(String[] args) {
        Dog d = new Dog("小黑", 2);
        Forg f = new Forg("小青", 3);
        rabbit r = new rabbit("小白", 2);
        System.out.println(d.getName() + ", " + d.getAge());
        f.eat();
        f.swim();
        r.eat();

    }


}
