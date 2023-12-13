package com.fy.test;

import java.util.Scanner;

/**
 * 输出信息(for循环)
 * @author cly
 * @date 2023年11月30日
 */
public class ForTest4 {

	public static void main(String[] args) {
		System.out.println("执行开始");
		String name = "西行寺幽幽子";
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入停止的次数:");
		int size = scanner.nextInt();
	    /* for( ; ; ){//等同于while(true)
	    	 
	     }
	     */
		//for(i = 0 ; i < j ;){//无限循环
		for(int i = 0 ; i <= size ; i++){
			System.out.println(name+"吃了"+i+"块蛋糕");
		}
			System.out.println(name+"吃饱了~");
			scanner.close();
	}

}
