package com.heima.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //学习任务：求数组中的最值
        int[] array1 = {33, 5, 22, 44, 55, 43};
        int MaxNumber = array1[0];
        for(int i = 0; i < array1.length; i++){
            if(array1[i]>=MaxNumber){
                MaxNumber = array1[i];
            }
        }
        System.out.println("数组中最大值为" + MaxNumber);
    }
}
