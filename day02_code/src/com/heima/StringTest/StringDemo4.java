package com.heima.StringTest;

import java.util.Scanner;

public class StringDemo4 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str_result = reverserStr(str);
        System.out.println(str_result);

    }

    public static String reverserStr(String str){

        //核心1：倒着遍历就可以实现字符串反转
        //从字符串中提取字符使用charAt这个函数
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
