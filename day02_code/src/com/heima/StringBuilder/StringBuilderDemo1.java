package com.heima.StringBuilder;

public class StringBuilderDemo1  {
  public static void main(String[] args) {
    //1. 创建stringBuilder对象
    StringBuilder sb = new StringBuilder("abc");
    //2. 添加元素
    sb.append(1);
    //3. 反转元素
    sb.reverse();
    //4. 获取长度
    int len = sb.length();
    System.out.println(len);
    System.out.println(sb);
  }

}
