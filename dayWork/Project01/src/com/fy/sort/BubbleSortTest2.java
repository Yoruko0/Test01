package com.fy.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 	 要点:
 * 1.两两相邻的数据值做交换
 * @author cly
 * @date 2023年12月4日
 */
public class BubbleSortTest2 {

	public static void main(String[] args) {
			//定义一个数组
		int [] nums = {11,22,33,10};
								//0		1	2		3//索引位置编号
								//外层循环:第一轮
								// 内层循环:22 , 88 , 33 , 10
								// 内层循环::22 , 33 , 88 , 10
								// 内层循环::22 , 33 , 10 , 88
		//编写一个公共方法
		bubbleSortTest(nums);
		

	}
	public static void  bubbleSortTest(int [] nums) {
		/**
		 * 编程过程说明:
		 * 1.外层循环控制多少轮结束(i),还要把最大那个数据值不做比较
		 *2..内存循环(j)先判定是否有最小值,如有条件成立,做两个数据值位置交换
		 *    最小值往前移,最大值往后移
		 * 3.在交换之前,先把要移动的值先存储至临时位置变量名称team
		 */
		//外层循环:第一轮
		// 内层循环:22 , 88 , 33 , 10
		// 内层循环::22 , 33 , 88 , 10
		// 内层循环::22 , 33 , 10 , 88
		
		//第一轮
		int team = 0;//临时存储变量名称
		int i = 0;
		for (int j = 0; j < nums.length-1-i; j++) {
			//判定条件
			    if (nums[j] > nums[j+1] ){//条件成立,做两个数据值位置交换
			    	System.out.println("进入判定条件,"+nums[j]+">"+nums[j+1]);
			    	team = nums[j];
			    	//数据值位置交换之前,第一个位置要交换先存储至临时变量名称 team
					nums[j] = nums[j+1];
					nums[j+1] = team;
					System.out.println("交换后数据:"+Arrays.toString(nums));
				}
		}
		System.out.println("第"+i+"轮:"+Arrays.toString(nums));
		
		//第二轮
		team = 0;//临时存储变量名称
		i = 1;
		for (int j = 0; j < nums.length-1-i; j++) {
			//判定条件
			    if (nums[j] > nums[j+1] ){//条件成立,做两个数据值位置交换
			    	System.out.println("进入判定条件,"+nums[j]+">"+nums[j+1]);
			    	team = nums[j];
			    	//数据值位置交换之前,第一个位置要交换先存储至临时变量名称 team
					nums[j] = nums[j+1];
					nums[j+1] = team;
					System.out.println("交换后数据:"+Arrays.toString(nums));
				}
		}
		System.out.println("第"+i+"轮:"+Arrays.toString(nums));
		
		//第三轮
		team = 0;//临时存储变量名称
		i = 2;
		for (int j = 0; j < nums.length-1-i; j++) {
			//判定条件
			    if (nums[j] > nums[j+1] ){//条件成立,做两个数据值位置交换
			    	System.out.println("进入判定条件,"+nums[j]+">"+nums[j+1]);
			    	team = nums[j];
			    	//数据值位置交换之前,第一个位置要交换先存储至临时变量名称 team
					nums[j] = nums[j+1];
					nums[j+1] = team;
					System.out.println("交换后数据:"+Arrays.toString(nums));
				}
		}
		System.out.println("第"+i+"轮:"+Arrays.toString(nums));
	}

}
