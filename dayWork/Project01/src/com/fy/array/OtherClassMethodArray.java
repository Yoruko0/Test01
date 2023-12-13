package com.fy.array;
/**
 * 调用MethodParament4的showAge方法
 * @author cly
 * @date 2023年12月1日
 */
public class OtherClassMethodArray {

	public static void main(String[] args) {
		int[] ages = {16,17,18};
		MethodParament4.showAges(ages);//ctrl查看调用方法所在类
		MethodParament4.showUserOfAge(24);
		
		String [] names = MethodParamentReturn5.getUserNames();
		for(String n : names){
			System.out.println(n);
		}
	}

}
