package com.heima.Stage1Test;

public class TestDemo2 {
    public static void main(String[] args) {
        //Test2:判断101-200之间有多少个素数，并输出所有素数
        int[] ZhiShu = new int[100];
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            if (isFalseZhiShu(i) == true) {
                ZhiShu[count] = i;
                count++;
            }
        }
        System.out.println("共有" + count + "个质数");
        for (int i = 0; i < count; i++) {
            System.out.print(ZhiShu[i] + " ");
        }
    }

    //书写一个判断素数的方法
    public static boolean isFalseZhiShu(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
