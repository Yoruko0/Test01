package com.fy.test;

import java.util.Scanner;

/**
 * 输出10次信息(do..while循环)
 * @author cly
 * @date 2023年11月30日
 */
public class DoWhileTest3 {

	public static void main(String[] args) {
		System.out.println("执行开始");
		System.out.println("请输入要停止次数:");
		String name = "西行寺幽幽子";
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int i = 1;//1.设置初始化值
		do {//哪怕while条件不成立,至少执行一次
			//条件成立之下,然后执行{}里的代码
			System.out.println(name+"吃了"+i+"块蛋糕");
			i++;//3.自动增长(步长设置)
			//忘记放开此行,则会无限循环(死循环)
		}while(i <= size);//2.判断条件是否成立
			System.out.println(name+"吃饱了~");
			scanner.close();
	}

}
