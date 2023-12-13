package com.fy.switch1;

import java.util.Scanner;

/**
 * switch判定
 * 修改:代码简洁
 * @author cly
 * @date 2023年11月28日
 */
public class SwitchTest2 {

	public static void main(String[] args) {
		System.out.println("请输入数字:");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		switch(day){
		      //选择分支
				case 1 :
				case 2:
				case 3:
				case 4:
				case 5:
					System.out.println("输入的数字是:"+day+"\n今天是周"+day);
					break;
					
				case 6:
				case 7:
					System.out.println("输入的数字是:"+day+"\n今天是周日");
					break;
					
				default :
					System.out.println("输入有误");
					
					
		}

	}

}
