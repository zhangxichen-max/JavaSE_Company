package com.heima.ClassTest;

public class Car {
    private String grand;
    private int price;
    private String color;


    public Car() {
    }

    public Car(String grand, int price, String color) {
        this.grand = grand;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     * @return grand
     */
    public String getGrand() {
        return grand;
    }

    /**
     * 设置
     * @param grand
     */
    public void setGrand(String grand) {
        this.grand = grand;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

}
