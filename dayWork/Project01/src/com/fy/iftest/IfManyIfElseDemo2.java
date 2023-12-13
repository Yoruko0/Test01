package com.fy.iftest;

import java.util.Scanner;

/**
 * 条件判定:
 *   if ... else    if(判定条件)   ...多重判定   ...else(前面条件都不成立时,最后输出的结果)
 * @author cly
 * @date 2023年11月28日
 */
public class IfManyIfElseDemo2 {

	public static void main(String[] args) {
		    System.out.println("请输入日期:");
			Scanner sc = new Scanner(System.in);
			int day = sc.nextInt();//一周1-5是工作日,6-7休息日
			//有重复代码要学会去重构 
			if (day >= 1 && day <= 5) {
				System.out.println("工作日");
			}
			else if (day >= 6 && day <= 7) {
				System.out.println("休息日");
			}
			else {//前置条件都不成立则执行
				System.out.println("输入有误");
			}
	}

}
