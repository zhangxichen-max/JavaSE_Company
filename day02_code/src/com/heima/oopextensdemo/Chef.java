package com.heima.oopextensdemo;


public class Chef extends Person{

    public Chef() {
    }

    public Chef(String ID, String name, String salary) {
        super(ID, name, salary);
    }

    @Override
    public void work(){
        System.out.println("正在炒菜");
    }

}
