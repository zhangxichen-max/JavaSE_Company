package com.heima.arraydemo;

import java.util.Random;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 生成数组随机索引
        int[] array1 = {1, 2, 3, 4, 5};
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            int number = random.nextInt(array1.length);
            int temp = array1[number];
            array1[number] = array1[i];
            array1[i] = temp;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
