package com.heima.StringTest;

public class StringDemo3 {

    //在写程序之前需要先思考这样几个问题：
    //1. 我要干什么？ --遍历数组并把数组拼接成一个字符串
    //2. 我干这件事情需要什么才能完成？ -- 数组
    //3.我干完了是否需要吧结果返回给调用处 - 需要，因为要返回一个字符串

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr){
        String result = "[";
        if(arr.length == 0){
            System.out.println("[]");
        }
        if(arr == null){
            System.out.println("");
        }
        else{
            for (int i = 0; i < arr.length; i++) {

                if(i == arr.length - 1){
                    result = result + arr[i] + "]";
                }
                else{
                    result = result + arr[i] + ", ";
                }
            }
        }
        return result;
    }
}
