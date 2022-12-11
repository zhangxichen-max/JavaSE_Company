package com.heima.TwoDemensionArr;

public class TwoDimensionDemo２ {
    public static void main(String[] args) {
        int[][] yearArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum = 0;
        for (int i = 0; i < yearArr.length; i++) {
            int quartSum  = getSum(yearArr[i]);
            System.out.println("第" + (i+1) + "个季度的营业额为" + quartSum);
            yearSum = yearSum + quartSum;
        }
        System.out.println("全年的总营业额为" + yearSum);
    }
    //计算每个季度的营业额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
