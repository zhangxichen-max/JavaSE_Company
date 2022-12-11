package com.heima.TwoDemensionArr;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        //Part1: 定义二维数组
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        //我们在书写二维数组时，可以把一维数组写成一行
        int[][] arr2= {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };

        // Part2： 寻找二维数组中的元素
        System.out.println(arr2[0][0]);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+ "　");
            }
            System.out.println();
        }
    }
}
