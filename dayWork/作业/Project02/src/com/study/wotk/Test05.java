package com.study.wotk;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 基础练习
 * @author cly
 * @date 2023年12月1日
 */
public class Test05 {

	public static void main(String[] args) {
		//1.
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("请输入星期数:");
		int week = scanner.nextInt();
		if (week == 1) {
			System.out.println("跑步");
		}
		else if (week == 2) {
			System.out.println("游泳");
		}
		else if (week == 3) {
			System.out.println("慢走");
		}
		else if (week == 4) {
			System.out.println("单车");
		}
		else if (week == 5) {
			System.out.println("拳击");
		}
		else if (week == 6) {
			System.out.println("爬山");;
		}
		else if (week == 7) {
			System.out.println("吃");
		}
		else {
			System.out.println("输入有误");
		}
		
		switch (week) {
		case 1:
			System.out.println("跑步");
			break;
		case 2:
			System.out.println("游泳");
			break;
		case 3 :
			System.out.println("慢走");
			break;
		case 4 :
			System.out.println("单车");
			break;
		case 5 :
			System.out.println("拳击");
			break;
		case 6 :
			System.out.println("爬山");
			break;
		case 7 :
			System.out.println("吃");
			break;
		default:
			break;
		}*/
		//2.
		/*for(int i = 1 ; i <= 100 ; i++ ){
			if ( i % 7 == 0 || i % 10 == 7 ) {
				System.out.println(i);
			}
		}*/
		//3.
		/*	int [] rabbit = new int [20];
			rabbit [0] = 1;
			rabbit [1] = 1;
			for(int i = 2 ; i < rabbit.length ; i++){
				rabbit [i] = rabbit [i - 2] + rabbit [i - 1];
		}
			System.out.println("兔子的数量为:"+rabbit[19]);*/
		
		//4.
	/*	for(int jw = 0 ; jw <= 20 ; jw++){
			for(int jm = 0 ; jm <= 33 ; jm++){
				int jc = 100 - jw - jm;
				if ((5*jw) + (3*jm)+(jc/3) == 100) {
					System.out.println("鸡翁有:"+jw);
					System.out.println("鸡母有:"+jm);
					System.out.println("鸡雏有:"+jc);
				}
			}
		}*/
		//5.
	/*	int num[] = {68,27,95,88,171,996,51,210};
		int sum = 0;
		for(int i : num){
			if ((i % 10 != 7) && (i / 10 % 10 != 7) && (i % 2 == 0)) {
				System.out.println(i);
				sum = sum+i;
			}
		}
		System.out.println("最终元素和为:"+sum);*/
		//6.
//		int arr[] = {11,21,31,41,-1};
//		int arr2[] = {11,21,31,41,10};
//		boolean flag = false ;	
//		int count = 0;
//		int x = 0; 
//		if (arr.length == arr2.length) {
//			for (int i : arr) {
//				System.out.println("第"+(x++)+"个元素值:"+i);
//				flag = false;
//				int y = 0;
//				for (int j : arr2) {
//					System.out.println("第"+(y++)+"个元素值:"+j);
//					if (i == j) {
//						System.out.println(true);
//						System.out.println("第"+(count++)+"个元素对应");
//						flag = true;
//						break;
//					}
//				}
//			}
//			 if ( flag == true) {
//				System.out.println("数组完全相同");
//			}
//			 else if (flag == false) {
//				System.out.println("数组不同");
//			}
//			 
//	}
//		else {
//			System.out.println("数组不同");
//		}
		//7.
//		int arr[] = {19,28,37,46,50};
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入一个数组中的数据:");
//		int input = scanner.nextInt();
//		System.out.println("输入的数为:"+input);
//		for(int i = 0  ; i < arr.length ; i++){
//			if (arr[i] == input) {
//				System.out.println("该数据的索引值为:"+i);
//			}
//		}
//		scanner.close();
		//8.
//		int arr[] = {59,10,78,98,17};
//		int team = 0;
//		int team1 = 0;
//		for(int i = 0 ; i < arr.length-1-i ; i++){
//			team = arr[i];
//			team1 = arr[arr.length-1-i];
//			arr[i] = team1;
//			arr[arr.length-1-i]=team;
//			System.out.println(Arrays.toString(arr));

		//9.
//			int arr[] = new int[6];
//			Scanner scanner = new Scanner(System.in);				
//			for(int i = 0 ; i < arr.length ; i++){
//				System.out.println("请输入评分:");
//				arr[i] = scanner.nextInt();
//			}
//			 int max = getMax(arr);
//			 int min = getMin(arr);
//			 int sum = getSum(arr);
//			 int svg = (sum - max - min) / 4;
//			 System.out.println("平均分为:"+svg);
//			 scanner.close();
//	}
//	public static int getMax(int arr[]){
//		int maxScore = arr[0];
//		for(int j = 1 ; j < arr.length ; j++){
//			if (maxScore < arr[j]) {
//				maxScore = arr[j];
//			}
//		}
//		return maxScore;
//	}
//	public static int getMin(int arr[]){
//		int minScore = arr[0] ;
//		for(int j = 1 ; j < arr.length ; j++){
//			if (minScore > arr[j]) {
//				minScore = arr[j];
//			}
//		}
//		return minScore;
//	}
//	public static int getSum(int arr[]){
//		int sums = 0;
//		for(int j = 0 ; j < arr.length ; j++){
//			sums = sums+arr[j];
//		}
//		return sums;
	}
}
	

