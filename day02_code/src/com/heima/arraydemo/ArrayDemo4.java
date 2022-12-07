package com.heima.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //练习：实现数组的前半部分和后半部分的交换
        int[] array1 = {1, 2, 3, 4, 5};
        for (int i = 0, j = array1.length-1; i < j; i++, j--) {
            int temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
