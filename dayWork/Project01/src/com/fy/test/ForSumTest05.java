package com.fy.test;

import java.util.Scanner;

/**
 * for循环求和
 * @author cly
 * @date 2023年11月30日
 */
public class ForSumTest05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入停止的次数:");
		int size = scanner.nextInt();
		int sum = 0;
		for(int i = 0 ; i <= size ; i++){
			sum += i;
		}
		System.out.println(sum);
		scanner.close();
	}
	//1至100有多少偶数(偶数总数)
}



