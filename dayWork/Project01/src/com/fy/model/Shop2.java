package com.fy.model;

import com.fy.util.ContextUtil2;

/**
 * 商品封装类
 * @author cly
 * @date 2023年12月13日
 */
public class Shop2 {
			//属性,字段,成员变量
			//private int id;
			private String id;//编号
			private String name;
			private int days;//保质期
			private double price; // 价格
			private String bq;//商品标签
			private String fwm;//防伪码
			private int nums;//上架数量
			//把产生关系的这个类当成成员变量
			private Person person ;//商品类中有此人类
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getDays() {
				return days;
			}
			public void setDays(int days) {
				if (days >=1 && days < 60) {
					this.days = days;
				}
				else {
					System.err.println("保质期必须在1-60天之间");
				}
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				if (price >= ContextUtil2.PRICE) {
					this.price = price;
				}
				else {
					System.err.println("商品价格必须在"+ContextUtil2.PRICE+"元以上");
				}
			}
			public String getBq() {
				return bq;
			}
			public void setBq(String bq) {
				if (bq.equals("3A")) {
					this.bq = bq;
				}
				else {
					System.err.println("要求标签必须填入为3a");
				}
			}
			public String getFwm() {
				return fwm;
			}
			public void setFwm(String fwm) {
				this.fwm = fwm;
			}
			public int getNums() {
				return nums;
			}
			public void setNums(int nums) {
				if (nums >= ContextUtil2.NUMS) {
					this.nums = nums;
				}
				else {
					System.err.println("上架数量要求必须填入为:"+ContextUtil2.NUMS+"件");
				}
			}
			
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			
			public Person getPerson() {
				return person;
			}
			public void setPerson(Person person) {
				this.person = person;
			}
			@Override
			public String toString() {
				return "Shop2 [id=" + id + ", name=" + name + ", days=" + days + ", price=" + price + ", bq=" + bq
						+ ", fwm=" + fwm + ", nums=" + nums + ", person=" + person + "]";
			}
			
//			@Override
//			public String toString() {
//				return "Shop2 [name=" + name + ", days=" + days + ", price=" + price + ", bq=" + bq + ", fwm=" + fwm
//						+ ", nums=" + nums + "]";
//			}
			
			
}
