package com.heima.oopextensdemo;

public class Test {

    public static void main(String[] args) {
        Manager manager11 = new Manager("heima001", "zhangsan",
                "3500", "400");
        System.out.println(manager11.getID());
        manager11.work();
        manager11.eat();

        Chef chef = new Chef("heima002", "lisi", "8000");
        chef.work();
        chef.eat();
    }
}
