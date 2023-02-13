package com.heima.StringTest;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String username = "zhangxichen";
        String password = "11111111";

        int count = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(count<=3){
            System.out.println("请输入用户名");
            String username1 = sc.next();
            System.out.println("请输入密码");
            String password1 = sc.next();
            count++;
            if(username1.equals(username1) && password1.equals(password)){
                flag = true;
                break;
            }else {
                if (3 - count > 0) {
                    System.out.println("输入用户名或密码错误， 您还有" + (3 - count) + "次机会");
                }else{
                    break;
                }
            }
        }
        if(flag){
            System.out.println("登录成功");
        }else{
            System.out.println("您已尝试3次，登录失败");
        }

    }
}
