package com.heima.Stage1Test;

import java.util.Random;
import java.util.Scanner;

public class TestDemo6 {
    public static void main(String[] args) {
        int[] primaryCode = new int[7];
        int[] userCode = new int[7];
        int redCount =0, blueCount=0;
        primaryCode = createCode();
        for (int i = 0; i < primaryCode.length; i++) {
            System.out.print(primaryCode[i] + " ");
        }
        System.out.println();
        userCode = userInputNumber();
        redCount = winRedNumber(primaryCode, userCode);
        blueCount = winBlueNumber(primaryCode, userCode);
        System.out.println("红球猜中了"+ redCount + "个, " + "篮球猜中了" + blueCount + "个。");



    }
    //系统随机生成双色球号码：红球不能重复
    public static int[] createCode(){
        int[] redCode = new int[7];
        Random random = new Random();
        for(int i = 0; i<redCode.length-1; ){
            int number = random.nextInt(33) + 1;
            if(!isCurrent(redCode, number)){
                redCode[i] = number;
                i++;
            }
        }
        redCode[redCode.length-1] = random.nextInt(16)+1;
        return redCode;
    }

    //判断数据是否再数组中
    public static boolean isCurrent(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }

    public static int[] userInputNumber(){
        int[] userNumber = new int[7];
        Scanner sc = new Scanner(System.in);
        //输入红球号码
        for(int i = 0; i<6;){
            System.out.println("请输入第"+ (i+1) +"个红球号码：");
            int number = sc.nextInt();
            if(number>=0&&number<=33){
                if(!isCurrent(userNumber, number)){
                    userNumber[i] = number;
                    i++;
                }
                else{
                    System.out.println("您输入的数据有重复，请重新输入");
                }
            }else{
                System.out.println("您输入的数据超出范围，请从1-33中选择输入");
            }
        }
        while(true){
            System.out.println("请输入篮球号码");
            int blueNumber = sc.nextInt();
            if(blueNumber>=0&&blueNumber<=16){
                userNumber[userNumber.length-1]=blueNumber;
                break;
            }
        }
        return userNumber;
    }

    public static int winRedNumber(int[] arrNumber, int[] userNumber){
        int redCount = 0;
        for(int i = 0 ; i<arrNumber.length-1; i++){
            for(int j = 0 ;j < userNumber.length-1; j++ ){
                if(userNumber[j] == arrNumber[i]){
                    redCount++;
                    break;
                }
            }
        }
        return redCount;
    }

    public static int winBlueNumber(int[] arrNumber, int[] userNumber){
        int blueCount = 0;
        if(arrNumber[arrNumber.length-1] == userNumber[userNumber.length-1]){
            blueCount = 1;
        }
        return blueCount;
    }

}
