package com.heima.skiploopDemo;

public class skiploopdemo1 {
    public static void main(String[] args) {
        // 跳过一次循环
        for(int i = 1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println("小老虎在吃" + i + "个包子");
        }
    }
}
