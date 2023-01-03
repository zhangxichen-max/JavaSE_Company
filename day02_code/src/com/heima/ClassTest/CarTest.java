package com.heima.ClassTest;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        //键盘录入：
        //第一套体系
        //nextInt():接收整数
        //nextDouble():接收小数
        //next():接收字符串
        //遇到空格，制表符、回车就停止接收。这些符号后面的数据就不会接受了

        //第二套体系：
        //nextLine();接收字符串

        //1. 创建一个对象数组
        Car[] cars = new Car[3];

        Scanner sc = new Scanner(System.in);
        //2.通过for循环键盘输入
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();
            //录入品牌
            System.out.println("请输入第"+ i + "个对象的品牌");
            String str_brand = sc.next();
            //录入价格
            System.out.println("请输入第"+ i + "个对象的价格");
            int int_price = sc.nextInt();
            //录入颜色
            System.out.println("请输入第"+ i + "个对象的颜色");
            String str_color = sc.next();
            car.setGrand(str_brand);
            car.setPrice(int_price);
            car.setColor(str_color);
            cars[i] = car;
        }

        //3. 将cars的内容打印出来
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getGrand() + ", " + cars[i].getPrice() + ", " + cars[i].getColor());
        }

    }
}
