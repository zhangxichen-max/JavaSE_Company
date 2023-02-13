package com.heima.StringTest;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //1. 键盘输入字符串，然后遍历
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //进行字符串遍历
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if(c>='a' && c<='z'){
                smallCount++;
            }else if(c>='0' && c<='9'){
                numberCount++;
            }

        }
        System.out.println("大写字母个数为" + bigCount);
        System.out.println("小写字母个数为" + smallCount);
        System.out.println("数字个数为" + numberCount);
    }
}
