package com.heima.demo1;

import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        //在代码中，如果有小数参与运算，结果有可能是不精确的
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想拆分的数字");
        int i = sc.nextInt();

        //2.输入一个三位数，获取个位、十位、百位
        //个位：数值%10; 十位：数值/10%10; 百位：数值/10/10 %10
        int i1 = i/100;
        int i2 = (i-i1*100)/10;
        int i3 = (i-i1*100-i2*10);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

    }
}
