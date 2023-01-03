package com.heima.ClassTest;

// 此类用于定义存储3个商品对象
public class Goods {
    private String id;
    private String name;
    private String price;
    private String count;

    public Goods() {
    }

    public Goods(String id, String name, String price, String count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 获取
     * @return count
     */
    public String getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(String count) {
        this.count = count;
    }

}
