package com.fy.test;

public class UserTest {

	public static void main(String[] args) {
		//创建一些人(无管理)
		String name = "八云紫";
		String name2 = "幽幽子";
		String name3 = "铃仙";
		//把所有姓名加入到一组(数组)--->只能存放同一种类型
		String result[] = {"八云紫","幽幽子","铃仙"};
		//要求:八云紫对应年龄18,对应编号.对应地址
		//引入对象[new后获得对象]和类[相当于图纸]
		//先有类,然后有对象[new之后]
		
			UserTest  userTest = new UserTest();
			
			//类里有: String name 则认为是叫属性 ,  字段,类中的成员变量
			//方法: 休息(),睡()
	}
}
