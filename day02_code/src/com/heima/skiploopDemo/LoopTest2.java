package com.heima.skiploopDemo;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*求平方根练习，键盘录入一个大于等于2的整数x,计算并返回x的平方根，结果只保留整数部分，去掉小数部分*/
        //键盘输入提示
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数");
        int temp = 0;
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
            if(i*i < number){
                continue;
            }
            else if(number == i*i) {
                System.out.println(i);
                break;
            }else{
                System.out.println(i-1);
                break;
            }
        }
    }
}
