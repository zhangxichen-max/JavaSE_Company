package com.heima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        int[] array1 = {11, 22, 33, 44, 55};
        printAll(array1);
        System.out.println(getMAxNumber(array1));

    }
    public static void printAll(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            if(i == array.length - 1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + ",");
            }
        }
        System.out.println("]");
    }

    public static int getMAxNumber(int[] array){
        int maxNumber = array[0];
        for(int i = 1; i< array.length; i++){
            if(array[i]>maxNumber){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
