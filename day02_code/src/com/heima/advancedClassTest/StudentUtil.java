package com.heima.advancedClassTest;

import java.util.ArrayList;

public class StudentUtil {
    // 定义私有的构造方法
    private StudentUtil(){

    }
    // 获取最大的年龄
    public static int getMaxAge(ArrayList<Student> list){
        int maxAge = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getAge()>maxAge){
                maxAge = stu.getAge();
            }
        }
        return maxAge;
    }

}
