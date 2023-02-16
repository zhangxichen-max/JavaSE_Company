package com.heima.oopextensdemo;

public class Manager extends Person {
    private String bonus;

    public Manager() {
    }

    public Manager(String ID, String name, String salary, String bonus) {
        super(ID, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("管理其他人");
    }
}
