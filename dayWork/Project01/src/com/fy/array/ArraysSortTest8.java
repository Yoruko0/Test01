package com.fy.array;

import java.util.Arrays;

/**
 * Arrays类的方法:
 *     排序sort
 * @author cly
 * @date 2023年12月4日
 */
public class ArraysSortTest8 {

	public static void main(String[] args) {
		//sort升序
		int [] nums = {1,14,5,19,810};
		System.out.println("没有排序之前:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+"\t");
		}
		//调用Arrays类
			Arrays .sort(nums);
			System.out.println("\n排序之后:");
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i]+"\t");
			}
		//降序
			System.out.println();
			System.out.println("降序之后:");
			for(int i = nums.length-1  ; i >=0 ; i--){
				System.out.print(nums[i]+"\t");
			}
	}

}
