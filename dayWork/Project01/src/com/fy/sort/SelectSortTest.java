package com.fy.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @author cly
 * @date 2023年12月5日
 */
public class SelectSortTest {

	public static void main(String[] args) {
		int num[] = {66,-1,0,-10};
								//0   1  2   3
								//{-10 -1 0 66}
		SelectSort(num);

	}
	//选择排序方法
	public static void SelectSort(int num[]) {
		System.out.println("原始数据:"+Arrays.toString(num));
		/**
		 * 选择排序要点:
		 * 1.先定义第一个索引位置设定两个临时变量名称,minVal(接受最小值),minIndex(最小值的索引位置编号)
		 * 2.内层for循环,判定是否有最小值,以minVal变量名称去依次与后面的数据值做比较
		 * 3.如判定条件成立,证明有最小值,得到最小值赋值给minVal,minIndex
		 * 4.以minIndex判定是否是i索引位置minIndex != i , 把两个位置的数据做交换
		 */
		
		/*int minVal = num[0];
		int minIndex = 0;*/
		//第一轮
		int count = 1;
		
		int i = 0;
		int minVal = num[i];
		int minIndex = i;
		for(int j = i+1 ; j < num.length ; j++){//将最小值和后一个数比较
			if(minVal>num[j]){
				System.out.println("进入内层判定条件:"+minVal+">"+num[j]);
					minVal = num[j];//当前本轮最小值赋给minVal
					minIndex = j;//当前本轮最小值赋值给minIndex
					
			}
		}
		if (minIndex != i) {//把两个位置的数据做交换
			num[minIndex] = num[i];
			num[i] = minVal;
		}
		//System.out.println("交换后数据"+Arrays.toString(num));
		System.out.println("第"+(count++)+"轮数据值:"+Arrays.toString(num));
		
		//第二轮
		
		 i = 1;
		 minVal = num[i];
		 minIndex = i;
		for(int j = i+1 ; j < num.length ; j++){//将最小值和后一个数比较
			if(minVal>num[j]){
				System.out.println("进入内层判定条件:"+minVal+">"+num[j]);
					minVal = num[j];//当前本轮最小值赋给minVal
					minIndex = j;//当前本轮最小值赋值给minIndex
					
			}
		}
		if (minIndex != i) {//把两个位置的数据做交换
			num[minIndex] = num[i];
			num[i] = minVal;
		}
		//System.out.println("交换后数据"+Arrays.toString(num));
		System.out.println("第"+(count++)+"轮数据值:"+Arrays.toString(num));
	}

}
