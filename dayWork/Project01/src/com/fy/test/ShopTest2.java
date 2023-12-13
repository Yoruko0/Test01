package com.fy.test;

import java.util.UUID;

import com.fy.model.Person;
import com.fy.model.Shop2;

/**
 * 测试商品类
 * @author cly
 * @date 2023年12月13日
 */
public class ShopTest2 {

	public static void main(String[] args) {
		//c85df4c2-dc22-4f2b-b676-952225bd53e3  要求把所有的-去除
		System.out.println(UUID.randomUUID());//产生随机字符串,
		Shop2 shop2 = new Shop2();
		shop2.setId(UUID.randomUUID().toString());
		
		shop2.setName("卫龙辣条");
		shop2.setDays(35);
		shop2.setNums(12);
		shop2.setBq("3A");
		shop2.setFwm(String.valueOf(System.currentTimeMillis()));
		shop2.setPrice(10);
		//System.out.println(shop2);
		
		Person person = new Person();
		person.setName("阿罗娜");
		person.setTel("114514");
		shop2.setPerson(person);
		
		System.out.println(shop2);
		
		
	}

}
