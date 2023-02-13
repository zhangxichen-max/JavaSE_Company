package com.heima.StringTest;

import java.util.Scanner;

// 做金额转换
public class StringDemo5 {
    public static void main(String[] args) {

        //1、首先要输入数字，并且判断数字是否合法
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入需要转换的数字");
            number = sc.nextInt();
            if(number>=0&&number<9999999){
                break;
            }
            else{
                System.out.println("输入的数据不在合法范围内，请重新输入");
            }
        }
        System.out.println(number);


        //2、遍历将数字转为大写的字符
        String result = "";
        while(true){
            int ge = number%10;  //2135
            //最后提取完跳出即可
            if(ge == 0){
                break;
            }
            number = number/10;
            String result1 = toStringChinese(ge);
            result = result1 + result;

        }
        System.out.println(result);

        //3. 在前面需要补足零
        int count = 7 - result.length();
        for (int i = 0; i < count; i++) {
            result = "零" + result;
        }
        System.out.println(result);

        //4. 需要根据单位补足信息
        String result1 = "";
        String[] arr1 = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            result1 = result1 + c + arr1[i];
        }

        System.out.println(result1);
    }

    public static String toStringChinese(int a){
        String[] arr = {"零","壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[a];
    }

}
