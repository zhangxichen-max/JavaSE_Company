package com.heima.methoddemo;

public class MethodDemo6 {
    //需求：定义一个方法copyOfRange(int[] arr, int from, int yo)
    //功能：将数组arr从索引from(包含from)开始，到索引to结束(不包含to)的元素复制到新数组中，并将新数组返回。
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 2, 5, 32, 54};
        int[] array2 = copyOfRange(array1, 2, 6);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr, int from, int to){
        int numberLength = to - from;
        int[] arr1 = new int[numberLength];
        for (int i = from, j = 0; i < to; i++, j++) {
            arr1[j] = arr[i];
        }
        return arr1;
    }
}
