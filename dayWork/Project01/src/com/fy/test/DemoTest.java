package com.fy.test;

public class DemoTest {

	public static void main(String[] args) {
		getName();

	}
	//成员变量和方法名称都要小驼峰式命名
	public static String getName() {//自身调用自身(递归)
		String name = "zs";
		System.out.println(name);
		return name;
	}

}
