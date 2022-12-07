package com.heima.skiploopDemo;

import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    //需求：实现一个猜数的小游戏，1~100
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;  //范围是从0开始，结束是最后-1，表示从0~99
        int inputNumber = 0 ;
        System.out.println(number);
        while(true){
            System.out.println("请输入一个数字");
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();
            if(inputNumber>number){
                System.out.println("你输入的数字过大");
            }else if(inputNumber<number){
                System.out.println("输入的数字过小");
            }else{
                System.out.println("猜中了");
                break;
            }
        }
    }
}
