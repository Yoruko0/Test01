package com.fy.test;

import com.fy.model.Shop;

/**
 * 测试商品类
 * @author cly
 * @date 2023年12月12日
 */
public class ShopTest {

	public static void main(String[] args) {
		//创建对象是什么类型,返回就是使用对应的类型,或是父类的类型接收
		//Object object = new String();//多态接收
		Shop shop = new Shop();
		shop.setShopName("水月雨日轮2");
		shop.setPrice(25000.99);
		shop.setNum(114514);
		
		shop.shopNameInfo();
		
		//多条数据存储(引用集合)
	}

}
