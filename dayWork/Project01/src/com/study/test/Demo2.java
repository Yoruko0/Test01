package com.study.test;
/**
 * string和int类型转换
 * @author cly
 * @date 2023年11月27日
 */
public class Demo2 {

	public static void main(String[] args) {
		String password = "888888";
		int repassword = 888888;
		System.out.println(password.equals(repassword));
		//如果要转换,则需要把password转换成int类型
		System.out.println(Integer.parseInt(password) == repassword);
		System.out.println(Integer.valueOf(password) == repassword);
		
		String str2 = String.valueOf(repassword);
		System.out.println(password.equals(str2));

	}

}
