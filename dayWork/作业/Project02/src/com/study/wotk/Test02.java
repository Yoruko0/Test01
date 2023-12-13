package com.study.wotk;

import java.util.Scanner;

/**
 * if相关练习
 * @author cly
 * @date 2023年11月28日
 */
public class Test02 {

	public static void main(String[] args) {
			//1.
		/*double newphone = 7988;
		double oldPhone = 1500;
		double Phone = 7988 * 0.8;
		double phone2 = newphone - oldPhone;
		if (Phone > phone2) {
			System.out.println("以旧换新划算");
		}
		else {
			System.out.println("不要以旧换新");
		}
		*/
		//2.
		/*Scanner scanner = new Scanner(System.in);
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();
		int min = s1;
		if (min > s2) {
			min = s2;
		}
		else if (s3 < min) {
			min = s3;
		}
		System.out.println("最小值为:"+min);
		*/
		//3.
		/*
		 System.out.println("请输入存入金额:");
		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();
		System.out.println("请输入存放年限:");
		int year = scanner.nextInt();
		double oneyear = money + money * 0.0225 * 1;
		double twoyear = money + money * 0.027 * 2;
		double threeyear = money + money * 0.0325 * 3;
		double fiveyear = money + money * 0.036 * 5;
		if (money >= 1000 && year == 1) {
			System.out.println("本息为:"+oneyear);
		}
		else if (money >= 1000 && year == 2) {
			System.out.println("本息为:"+twoyear);
			
		}
		else if (money >= 1000 && year == 3) {
			System.out.println("本息为:"+threeyear);
		}
		else if (money >= 1000 && year == 5) {
			System.out.println("本息为:"+fiveyear);
		}
		else {
			System.out.println("输入有误");
		}
		*/
		//4.
		/*
		System.out.println("请输入顾客类别(0 or 1 ):");
		Scanner scanner = new Scanner(System.in);
		int gk = scanner.nextInt();
		System.out.println("请输入原价:");
		double yj = scanner.nextDouble();
		if (gk == 0 && yj >= 100) {
			System.out.println("应付金额为:"+yj * 0.9);
		}
		else if (gk == 0 && yj < 100  ) {
			System.out.println("应付金额为:"+yj);
		}
		else if (gk == 1 && yj >= 200) {
			System.out.println("应付金额为:"+yj * 0.75);
		}
		else if (gk == 1 && yj < 200) {
			System.out.println("应付金额为:"+yj);
		}
		else if (gk < 0 || gk > 1 || yj < 0) {
			System.out.println("输入有误");
		}
		*/
		//5.
		System.out.println("输入税前工资:");
		Scanner scanner = new Scanner(System.in);
	    double gsgz = scanner.nextDouble();
	    double gs = gsgz - gsgz * 0.1;//个税
	    double gs2 = gs -5000;//个税超过5000
	    //纳税数额
		double ns = gs2 * 0.03;//0-3000
		double ns2 = (3000 * 0.03) + (gs2-3000) * 0.1;//3000-12000
		double ns3 = (3000 * 0.03) + (12000 * 0.1) +(gs2 - 3000 - 12000) * 0.2;//12000 - 25000
		double nsm = (3000 * 0.03) + (12000 * 0.1) + (25000 * 0.2) +
									(35000 * 0.25) + (55000 * 0.3) + (80000 * 0.35) + 
									(gs2 - 3000 - 12000 -25000 - 35000 - 55000 - 80000) * 0.45;//80000+
									
				
		//税后工资
		double sh = gs - ns;//0-3000
		double sh2 = gs - ns2;//3000-12000
		double sh3 = gs - ns3;//12000-25000
		double shm = gs - nsm;//80000+
		
		//判断纳税数额和税后工资
		if (gsgz < 0) {
			System.out.println("输入有误");
		}
			else if (gs < 5000 ) {
			System.out.println("不交税,税后工资为:"+gs);
			
		}
		else if (gs >= 5000) {
			if (gs2 >= 0 && gs2 <= 3000) {
				System.out.println("纳税数额为:"+ns);
				System.out.println("税后工资为:"+ sh);
			}
			else if (gs2 > 3000 && gs2 <= 12000) {
				System.out.println("纳税数额为:" + ns2);
				System.out.println("税后工资为:" + sh2 );
	
			}
			else if (gs2 > 12000 && gs2 <= 25000) {
				System.out.println("纳税数额为:"+ns3);
				System.out.println("税后工资为:" + sh3);
			}
			else if (gs2 > 80000) {
				System.out.println("纳税数额为:"+nsm);
				System.out.println("税后工资为:"+shm);
			}
		}	
	}

}
