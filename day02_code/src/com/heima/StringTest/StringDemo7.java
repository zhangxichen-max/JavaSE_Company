package com.heima.StringTest;

public class StringDemo7 {
    // 进行敏感词替换, 将敏感词替换成***
    public static void main(String[] args) {
        String str1 = "你玩的真好，下次不要再玩了!!! TMD";
        String[] arr = {"TMD", "MLGB"};
        for (int i = 0; i < arr.length; i++) {
            str1 = str1.replace(arr[i], "***");
        }
        System.out.println(str1);
    }
}
