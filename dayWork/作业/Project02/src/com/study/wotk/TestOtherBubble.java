package com.study.wotk;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author cly
 * @date 2023年12月4日
 */
public class TestOtherBubble {


	public static void main(String[] args) {
		/**
		 * 步骤:
		 * 1.定义一个数组
		 * 2.定义变量team用来存储变量值
		 * 3.定义变量i用来记录运行的轮数
		 * 4.定义双重for循环,外层循环用来控制轮数
		 * 5.内存循环用来对相邻的两个值进行比较,如果前一个大于后一个值,则进行位置交换
		 * 6.在交换前把要移动的存储在临时变量team里
		 */
		int arr [] = {70,30,34,16,70,-1,-1};
		arrtest(arr);

	}

	public static void arrtest(int [] arr) {
/*		int team = 0;//存储变量
		int i = 0;//记录轮数
		for(int j = 0 ; j < arr.length-1-i ; j++){
			if (arr[j] > arr[j+1]) {
				System.out.println("判定:"+arr[j]+">"+arr[j+1]);
				team = arr[j];
				arr[j] = arr [j+1];
				arr[j+1] = team;
				System.out.println("交换后数据:"+Arrays.toString(arr));
			}
			System.out.println("第"+i+"轮:"+Arrays.toString(arr));
		}
		team = 0;
		i = 1;
		for(int j = 0 ; j < arr.length-1-i ; j++){
			if (arr[j] > arr[j+1]) {
			System.out.println("判定:"+arr[j]+">"+arr[j+1]);
			team = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=team;
			System.out.println("交换后数据:"+Arrays.toString(arr));
			}
			System.out.println("第"+i+"轮:"+Arrays.toString(arr));
		}
		team = 0;
		i = 2;
		for(int j = 0 ; j < arr.length-1-i ; j++){
			if (arr[j] > arr[j+1]) {
			System.out.println("判定:"+arr[j]+">"+arr[j+1]);
			team = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=team;
			System.out.println("交换后数据:"+Arrays.toString(arr));
			}
			System.out.println("第"+i+"轮:"+Arrays.toString(arr));
	}
	*/
	/*	for(int i = 0 ; i < arr.length ; i++){
			int team = 0;
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					System.out.println("进入判定:"+arr[j]+">"+arr[j+1]);
					team = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = team;
				}
			System.out.println("交换后数据:"+Arrays.toString(arr));
			}
		}	*/				
		int team = 0;
		System.out.println("原始数据:"+Arrays.toString(arr));
		for(int i = 0 ; i < arr.length-1 ; i++){
			boolean flag = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					System.out.println("进入判定:"+arr[j]+">"+arr[j+1]);
					team = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = team;
					flag = false;
					System.out.println("交换后数据:"+Arrays.toString(arr));
				}
					
			}
			if (flag) {
			break;
			}
			System.out.println("第"+i+"轮"+Arrays.toString(arr));
		}
		System.out.println("最终数据:"+Arrays.toString(arr));
  }
}
