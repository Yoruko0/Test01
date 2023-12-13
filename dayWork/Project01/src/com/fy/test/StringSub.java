package com.fy.test;

public class StringSub {

	public static void main(String[] args) {
		String msg = "1.萝球部,$90,作者:苍山探";
		System.out.println(msg.indexOf("$"));//从左到右找
		System.out.println(msg.substring(msg.indexOf("$")));
		System.out.println(msg.lastIndexOf(","));//从右到左
		System.out.println(msg.substring(msg.lastIndexOf(",")));
		
		System.out.println(msg.substring(msg.indexOf("$") + 1 , msg.lastIndexOf(",")));
		System.out.println(System.currentTimeMillis());//生成当前时间,单位:毫秒
	}

}
