package com.study.wotk;

import java.util.Scanner;

/**
 * switch判断
 * @author cly
 * @date 2023年11月28日
 */
public class Test03 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int math1 = scanner.nextInt();
		System.out.println("请输入第二个数:");
		int math2 = scanner.nextInt();
		System.out.println("请输入要进行的运算:");
		int mathInput = scanner.nextInt();
		switch (mathInput) {
		case 1:
			System.out.println(math1 + math2);
			break;
		case 2 :
			System.out.println(math1 - math2);
			break;
		case 3 :
			System.out.println(math1 * math2);
			break;
			case 4 :
				System.out.println(math1 / math2);
				break;
			default :
				System.out.println("输入有误");
		}
		
	}

}
