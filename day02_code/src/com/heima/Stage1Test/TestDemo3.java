package com.heima.Stage1Test;

import java.util.Random;

public class TestDemo3 {
    public static void main(String[] args) {
        //生成5位验证码,前4位是大小写字母，后1位是数字
        //一般情况下从什么地方随机抽取，都是考虑自己创建一个数组，从数组中抽取
        //1.生成所有的大小写字母(此处比较难) 与 相关数字
        //2.随机抽取字母与数字
        //3.做一个排列

        //定义两个数组
        char[] ziMu = new char[52];

        //生成大小写字母的数组，a对应的ASCII为97，A对应的ASCII为65
        for(int i = 0 ; i < 52; i++){
            //生成小写字母
            if(i<=25){
                ziMu[i] = (char)(97 + i);
            }else{
                //生成大写字母
                ziMu[i] = (char)(65 + i -26);
            }
        }
        while(true){
            System.out.println(getCode(ziMu));
        }
    }
    public static String getCode(char[] ziMu){
        String codeNumber="";
        char[] code = new char[4];
        Random random = new Random();
        for(int i = 0; i<4; i++) {
            code[i] = ziMu[random.nextInt(52)];
            codeNumber = codeNumber + code[i];
        }
        return (codeNumber + random.nextInt(10));
    }
}
