package com.heima.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        //需求：使用方法重载的思想，设计比较两个整数是否相同的方法
        //要求：兼容全整数类型（byte, short, int, long）
        compare(10, 20);
    }

    //会把相同功能的方法定义成一样的名字
    //好处1：定义方法的时候可以不用那么多单词了；
    //好处2：调用方法的时候不需要那么麻烦了
    public static void compare(byte number1, byte number2){
        System.out.println(number1 == number2);
    }
    public static void compare(short number1, short number2){
        System.out.println(number1 == number2);
    }
    public static void compare(int number1, int number2){
        System.out.println(number1 == number2);
    }
    public static void compare(long number1, long number2){
        System.out.println(number1 == number2);
    }
}
