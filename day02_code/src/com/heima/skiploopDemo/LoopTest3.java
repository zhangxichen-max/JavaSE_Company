package com.heima.skiploopDemo;

import java.util.Scanner;

public class LoopTest3 {
    //题目要求：求质数，键盘录入一个正整数x,判断整数是否为一个质数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i<Math.sqrt(number); i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(number + "是一个质数");
        }else{
            System.out.println(number + "不是一个质数");
        }
    }
}
