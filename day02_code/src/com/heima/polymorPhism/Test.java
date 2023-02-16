package com.heima.polymorPhism;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("黑", 2);
        Cat c = new Cat("灰", 3);
        Person p1 = new Person("老王", 30);
        Person p2 = new Person("老李", 25);
        p1.keepPet(d, "骨头");
        p2.keepPet(c, "鱼");
    }
}
