package com.heima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //静态初始化
        //数组的完整格式是：数据类型[] 数组名 = new 数据类型[]{元素1， 元素2， 元素3...}
        //数组的简写格式为：数据类型[] 数组名 = {元素1， 元素2， 元素3...}
        //Task1: 存放班级中同学的年龄
        int[] array1 = new int[]{11, 12, 13, 14};
        int[] array2 = {11, 12, 13, 14};

        //Task2: 存放班级同学姓名：
        String[] array3 = new String[]{"Zhangsan", "deda", "eweqe"};
        String[] array4 = {"Zhangsan", "deda", "eweqe"};

        //Task3: 存放身高
        double[] array5 = new double[]{1.93, 1.75, 1.67, 1.87};
        double[] array6 = {1.93, 1.75, 1.67, 1.87};

        //打印出来的是地址值
        System.out.println(array1);

        //Task4：获取数组中的元素，直接arr[索引值]
        for(int i = 0; i<array1.length; i++){
            System.out.println(array1[i]);
        }
        //Task5：修改数组中的元素，直接对其进行赋值就可以，元素会进行覆盖
        //Task6: 遍历数组求和
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        System.out.println(sum);
    }
}
