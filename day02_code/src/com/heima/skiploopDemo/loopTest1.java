package com.heima.skiploopDemo;

public class loopTest1 {
    /*写一个小游戏表示逢7过*/
    //包含7 或者是7的倍数都可以过
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            //把每一位都提取出来
            int ge = i%10;
            int shi = i/10%10;
            if(i%7 == 0 || ge ==7 || shi==7){
                System.out.println("过");
            }else{
                System.out.println(i);
            }
        }
    }
}
