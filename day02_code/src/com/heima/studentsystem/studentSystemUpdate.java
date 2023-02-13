package com.heima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class studentSystemUpdate {
    public static void main(String[] args) {

        //一、用户输入控制指令
        Scanner sc = new Scanner(System.in);
        //创建一个集合,用来存放多个对象
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            //升级版界面要求注册界面、登录界面与忘记密码界面
            System.out.println("---------欢迎来到学生管理系统----------");
            System.out.println("请选择操作:1登录 2注册 3忘记密码 4退出");
            String choose = sc.next();
            switch(choose){
                case "1" : {
                    loginView(list);
                    break;
                }
                case "2": {
                    registerView(list);
                    break;
                }
                case "3":{
                    forgetPassword(list);
                    break;
                }
                case "4":{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("输入的字符无效，请重新输入");
                }
            }
        }
    }

    // ************************忘记密码功能*************************//
    public static void forgetPassword(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String useName = sc.next();
        int index = getUserIndex(list, useName);
        if(index>=0){
            Student stu = list.get(index);
            System.out.println("请输入用户的身份证号");
            String sIDCode = sc.next();
            System.out.println("请输入用户手机号码");
            String sPhoneNumber = sc.next();
            if(stu.getIDCode().equals(sIDCode)){
                if(stu.getPhoneNumber().equals(sPhoneNumber)){
                    System.out.println("请修改您的密码");
                    String password = sc.next();
                    stu.setPassword(password);
                }else{
                    System.out.println("您输入的手机号码不正确，修改失败");
                }
            }else{
                System.out.println("您输入的身份证号不正确");
            }

        }else{
            System.out.println("用户不存在，请先注册");
        }
    }

    // ************************登录功能相关方法**********************//
    public static void loginView(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到登录界面");
        System.out.println("请输入您的用户名");
        String userName;
        // 判断用户名是否存在
        while(true) {
            userName = sc.next();
            boolean flag = checkLoginUserName(list, userName);
            if(flag){
                break;
            }else{
                System.out.println("用户名未注册，请先注册再登录");
                // 回到初始选择界面
                return;
            }
        }

        int index = getUserIndex(list, userName);
        String rightPassword = list.get(index).getPassword();

        System.out.println("请输入您的密码");
        String password = sc.next();

        // 获取验证码
        String ConfirmCode = getConfirmCode();
        System.out.println("请输入下面的验证码" + ConfirmCode);
        String code = sc.next();
        if(code.equals(ConfirmCode)){
            // 判断对应的用户名的密码是否正确
            for(int i = 0; i < 3; i++)
            {
                if(password.equals(rightPassword)){
                    System.out.println("用户登录成功");
                    break;
                }else{
                    System.out.println("密码输入错误，您还有"+(2-i) + "次机会");
                    System.out.println("请输入您的密码");
                    password = sc.next();
                }
            }
        }else{
            System.out.println("验证码错误，请重新输入");
        }
    }

    public static boolean checkLoginUserName(ArrayList<Student> list, String useName){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(useName.equals(stu.getUserName())){
                return true;
            }
        }
        return false;
    }

    public static int getUserIndex(ArrayList<Student> list, String userName){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getUserName().equals(userName)){
                return i;
            }
        }
        return -1;
    }

    public static String getConfirmCode(){
        // 获取相应验证码功能
        //'a'对应的ASCII码为97, 'z'对应的是'122
        //'A'-> 65, 'Z'-> 90
        //'0'-> 48, '9'-> 57
        // 可以把大写字母和小写字母都放在一个列表中
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i<26; i++){
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }
        // 首先构造完整的字符串
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<4; i++){
            int index = random.nextInt(list.size());
            sb.append(list.get(index));
        }
        int number = random.nextInt(10);
        sb.append(number);

        // 开始打乱顺序，直接让随机索引与最后一个索引交换位置
        char[] arr = sb.toString().toCharArray();
        int indexNumber = random.nextInt(arr.length);
        char temp = arr[indexNumber];
        arr[indexNumber] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        String code = new String(arr);

        return code;
    }

    // ************************注册功能相关方法**********************//
    public static void registerView(ArrayList<Student> list){
        // 注册就是进行对象的添加
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        // 1.用户输入用户名
        while(true){
            System.out.println("欢迎来到用户注册界面");
            System.out.println("请输入用户名");
            //(1). 调用用户名判断的方法
            String userName = sc.next();
            boolean flag = checkUserName(list, userName);
            if(flag){
                stu.setUserName(userName);
                break;
            }else{
                System.out.println("用户名已存在或用户名输入格式有问题");
            }
        }

        // 2.用户输入密码：
        while(true){
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("请输入确认的密码");
            String confirmPassword = sc.next();
            if(password.equals(confirmPassword)){
                stu.setPassword(password);
                break;
            }else{
                System.out.println("两次密码不一致请重新设置");
            }
        }

        // 3. 验证身份证号码
        while(true){
            System.out.println("请输入身份证号");
            String IDCode = sc.next();
            // 调用验证身份证号码的方法
            boolean flag = checkIDCode(IDCode);
            if(flag){
                stu.setIDCode(IDCode);
                break;
            }else{
                System.out.println("输入的身份证号不符合规范");
            }
        }

        //4. 验证手机号
        while(true){
            System.out.println("请输入手机号");
            String phoneNumber = sc.next();
            // 调用验证身份证号码的方法
            boolean flag = checkPhoneNumber(phoneNumber);
            if(flag){
                stu.setPhoneNumber(phoneNumber);
                break;
            }else{
                System.out.println("输入的手机号不符合规范");
            }
        }

        list.add(stu);

    }

    public static boolean checkUserName(ArrayList<Student> list, String userName){
        //1、判断用户名是否唯一
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUserName().equals(userName)){
                return false;
            }
        }

        //2、用户名长度单位在3~15位之间
        if(userName.length()<3 || userName.length()>15){
            return false;

        }
        // 定义两个变量，分别记录字母和数字的个数
        int countNumber = 0;
        int countLetter = 0;
        //3、判断用户名是否是字母加数字的组合，不能是纯数字
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if( c>='0'&& c<='9'){
                countNumber++;
            }
            if(c>='a'&& c <='z' || c>='A' && c<='Z'){
                countLetter++;
            }
        }
        //4. 判断只能是字母加数字的组合
        if((countNumber+countLetter) != userName.length()){
            return false;
        }
        //5. 判断不能只能是纯数字
        if(countNumber==userName.length()){
            return false;
        }
        return true;
    }

    public static boolean checkIDCode( String IDCode){
        //1.判断长度位18位
        if(IDCode.length()!=18){
            return false;
        }
        //2. 判断不能以0为开头
        if(IDCode.charAt(0)=='0'){
            return false;
        }
        //3. 判断前17位都为数字
        for(int i =0; i<17; i++){
            char c = IDCode.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }

        //4、最后一位可以是数字，也可以是大写X或小写x
        char c1 = IDCode.charAt(17);
        if(!((c1 >= '0'&& c1 <= '9') || c1 =='X' || c1 =='x')){
            return false;
        }
        return true;
    }

    public static boolean checkPhoneNumber(String phoneNumber){
        if(phoneNumber.length() != 11){
            return false;
        }
        if(phoneNumber.charAt(0) == 0){
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(!(c >='0' && c <='9')){
                return false;
            }
        }
        return true;
    }

}
