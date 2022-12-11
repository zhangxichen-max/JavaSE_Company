package com.heima.methoddemo;

import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入第一个数");
            int num1 = sc.nextInt();
            System.out.println("请输入第一个数");
            int num2 = sc.nextInt();
            getSum(num1, num2);
        }
    }
    public static void getSum(int number1, int number2){
        int sum = number1 + number2;
        System.out.println(sum);
    }
}
