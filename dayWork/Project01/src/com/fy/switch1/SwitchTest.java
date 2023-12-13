package com.fy.switch1;

import java.util.Scanner;

/**
 * switch判定
 * @author cly
 * @date 2023年11月28日
 */
public class SwitchTest {

	public static void main(String[] args) {
		System.out.println("请输入数字:");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		switch(day){
		      //选择分支
				case 1 :
				  System.out.println("输入的数字是:"+day+"\n今天是周"+day);
				  break;//中断,后面不在执行
				case 2:
					System.out.println("输入的数字是:"+day+"\n今天是周"+day);
					break;
				case 3:
					System.out.println("输入的数字是:"+day+"\n今天是周"+day);
					break;
				case 4:
					System.out.println("输入的数字是:"+day+"\n今天是周"+day);
					break;
				case 5:
					System.out.println("输入的数字是:"+day+"\n今天是周"+day);
					break;
				case 6:
					System.out.println("输入的数字是:"+day+"\n今天是周"+day);
					break;
				case 7:
					System.out.println("输入的数字是:"+day+"\n今天是周日");
					break;
				default :
					System.out.println("输入有误");
					
					
		}
			scanner.close();
	}

}
