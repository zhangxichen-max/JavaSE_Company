package com.heima.StringTest;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //1. 假设键盘录入一个abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();  //键盘输入的字符串是new()出来的
        String str2 = "abc";
        System.out.println(str1.equals(str2));
    }
}
