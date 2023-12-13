package com.study.wotk;

import java.util.Arrays;

/**
 * 选择排序
 * @author cly
 * @date 2023年12月6日
 */
public class TestOtherSelect {

	public static void main(String[] args) {
		int arr[] = {50,70,14,35,60};
		arrSelect(arr);
	}

	public static void arrSelect(int[] arr) {
		System.out.println("原始数据为:"+Arrays.toString(arr));
		int count = 1;
	
		for(int i = 0 ; i < arr.length-1 ; i++){
		int minVal = arr[i];
		int minIndex = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (minVal > arr[j]) {
				System.out.println("进入判定:"+minVal + ">" + arr[j]);
				minVal = arr[j];
				minIndex = j ;
			}
		}
		if (minIndex != i) {
			arr[minIndex] = arr[i] ;
			arr[i] = minVal;
		}
		System.out.println("第"+(count++)+"轮结果为:"+Arrays.toString(arr));
	   }	
	}
}
