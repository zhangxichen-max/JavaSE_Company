package com.heima.StringTest;


public class StringDemo6 {
    public static void main(String[] args) {
        // 13 05 81 19991107 41 1 1
        // 13：省份
        // 05：城市
        // 81：区县
        // 19991107：出生年月日
        // 41：出生地派出所
        // 1：性别，奇数是男生，偶数是女生
        // 1 :随机产生

        // 1.定义一个身份证格式的字符串，
        String id = "320581202311014521";

        //2. 提取出生的年月日,从第六位开始
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String date = id.substring(12, 14);

        char gender = id.charAt(16);    //用来判断男女
        System.out.println(Integer.parseInt(String.valueOf(gender)));
        // 在ASCII码表中:
        // 字符'0' --> 48
        // '1' --> 49
        // 因此真正的数字为
        int number = gender - 48;
        //然后就可以进行就判断了



    }

}
