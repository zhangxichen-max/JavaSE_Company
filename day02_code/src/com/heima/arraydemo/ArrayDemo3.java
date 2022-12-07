package com.heima.arraydemo;

import java.util.Random;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array1 = new int[10];
        int count = 0;
        for(int i = 0 ; i<10; i++){
            array1[i] = r.nextInt(100) + 1;
        }
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        int average = sum/array1.length;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i]<average){
                count ++;
            }
        }
        System.out.println("数组和为" + sum + ", 平均数为" + average + ", 比平均数小的个数为" + count);


    }
}
