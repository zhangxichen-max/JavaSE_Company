package com.heima.polymorPhism;

public class Person {
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // 定义测试类方法
    public void keepPet(Animal a, String something){
        if(a instanceof Dog){
            Dog d = (Dog)a;
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + d.getColor()
                    + "颜色" + d.getAge() + "岁的狗");
            System.out.println(d.getAge() + "岁的" + d.getColor() + "颜色的狗两只前腿死死地抱住"+
                    something + "猛吃");
        }else if(a instanceof Cat){
            Cat c = (Cat)a;
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + c.getColor()
                    + "颜色" + c.getAge() + "岁的猫");
            System.out.println(c.getAge() + "岁的" + c.getColor() + "颜色的猫眯着眼睛侧着头吃"+
                    something);
        }
    }
}
