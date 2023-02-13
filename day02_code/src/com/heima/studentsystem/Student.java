package com.heima.studentsystem;

public class Student {
    //用户名、密码、身份证号码、手机号码
    private String userName;
    private String password;
    private String IDCode;
    private String phoneNumber;


    public Student() {
    }

    public Student(String userName, String password, String IDCode, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.IDCode = IDCode;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return IDCode
     */
    public String getIDCode() {
        return IDCode;
    }

    /**
     * 设置
     * @param IDCode
     */
    public void setIDCode(String IDCode) {
        this.IDCode = IDCode;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Student{userName = " + userName + ", password = " + password + ", IDCode = " + IDCode + ", phoneNumber = " + phoneNumber + "}";
    }
}
