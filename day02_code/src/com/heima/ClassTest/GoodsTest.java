package com.heima.ClassTest;

public class GoodsTest {
    public static void main(String[] args) {
        //1. 定义一个空数组，用来存放对象
        Goods[] goods = new Goods[3];

        //2. 创建对象
        Goods goods1 = new Goods("001", "保温杯", "100", "20");
        Goods goods2 = new Goods("002", "衬衫", "200", "20");
        Goods goods3 = new Goods("003", "外套", "300", "20");

        //3. 将数据对象存到数组里面
        goods[0] = goods1;
        goods[1] = goods2;
        goods[2] = goods3;

        for (int i = 0; i < goods.length; i++) {
            Goods goods4 = new Goods();
            goods4 = goods[i];
            System.out.println(goods4.getId() + ", "+ goods4.getName()+", " + goods4.getPrice()+ ", "+ goods4.getCount());
        }
    }
}
