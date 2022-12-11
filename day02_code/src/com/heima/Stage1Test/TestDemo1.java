package com.heima.Stage1Test;

import java.util.Scanner;

public class TestDemo1 {
    //练习1：机票价格按淡季、旺季收费，输入机票原价、月份、头等舱或者经济仓
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ticketPrice = 0;
        int month = 0, placeGrade = 0;
        while(true){
            System.out.println("请输入机票原价");
            ticketPrice = sc.nextInt();
            System.out.println("请输入要出行的月份");
            month = sc.nextInt();
            System.out.println("请输入是否要乘坐头等舱，是输入1，否输入0");
            //头等舱用1表示，经济舱用0表示
            placeGrade = sc.nextInt();
            System.out.println(queryTicket(ticketPrice, month, placeGrade));
        }
    }
    public static double queryTicket(double price, int month, int placeGrade){
        double ticketPrice = 0;
        //表示淡季
        if(month>=5 && month <=10){
            if(placeGrade == 1){
                ticketPrice = price*0.9;
            }else{
                ticketPrice = price*0.85;
            }
        }else{
            if(placeGrade == 1){
                ticketPrice = price*0.7;
            }else{
                ticketPrice = price*0.65;
            }
        }
        return ticketPrice;
    }
}