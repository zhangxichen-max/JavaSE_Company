package com.heima.Stage1Test;

import java.util.Scanner;

public class TestDemo5 {
    public static void main(String[] args) {
        //将数字密码采用加密方式进行存储，加密规则为：先得到每位数,每位数+5， 然后对10求余， 然后再反转
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原数字");
        int number = sc.nextInt();
        //将返回的数字返回一个数组回来
        System.out.println(getCode(number));
        System.out.println(decode(getCode(number)));
    }

    //对输入的任意数据进行加密
     public static int getCode(int number){
        int count = 0;
        int temp = number;
        int sum =0 ;
        //判断输入的数据是几位数
        while(number>0){
            number = number/10;
            count++;
        }
        int[] arrNumber = new int[count];

        for (int i = 0; i < arrNumber.length; i++) {
             arrNumber[i] = (temp % 10 + 5)%10;
             temp = temp/10;

         }
        for (int i = 0; i < arrNumber.length; i++) {
             sum = sum * 10 + arrNumber[i];
         }
         return sum;
     }

     //对输入的数据进行解密
    public static int decode(int number){
        int count = 0;
        int temp = number;
        int sum = 0;
        //判断解密的数据是几位数
        while(number>0){
            number = number/10;
            count++;
        }

        int[] arrDecode = new int[count];
        for(int i = 0; i<arrDecode.length; i++){
            arrDecode[i] = temp % 10;
            temp = temp/10;
        }

        for(int i = 0; i<arrDecode.length; i++){
            if(arrDecode[i]>=0&&arrDecode[i]<=4){
                arrDecode[i] = arrDecode[i]+ 10 -5;
            }else{
                arrDecode[i] = arrDecode[i] - 5;
            }
        }
        for (int i = 0; i < arrDecode.length; i++) {
            sum = sum * 10 + arrDecode[i];
        }
        return sum;
    }
}
