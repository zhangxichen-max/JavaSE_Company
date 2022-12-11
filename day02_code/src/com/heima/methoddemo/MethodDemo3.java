package com.heima.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {

        //任务：学会使用带返回初始的方法定义
        int sum1 = getSum(10, 20, 30);


    }

    public static int getSum(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }

}
