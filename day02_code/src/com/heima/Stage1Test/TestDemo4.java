package com.heima.Stage1Test;

import java.util.Scanner;

public class TestDemo4 {
    //本次的任务是设计评委打分系统，键盘输入6个分数，然后去掉最高分和最低分，最终返回一个分数
    public static void main(String[] args) {
        int[] scores = new int[6];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ;i < scores.length; ){
            System.out.println("请输入评委的打分");
            int number = scanner.nextInt();
            if(number>=0 && number<=100){
                scores[i] = number;
                i++;
            }
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]+ " ");
        }
    }
}
