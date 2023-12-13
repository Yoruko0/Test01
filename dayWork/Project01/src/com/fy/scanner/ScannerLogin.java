package com.fy.scanner;

import java.util.Scanner;

/**
 * 学习使用Scanner类
 * @author cly
 * @date 2023年11月28日
 */
public class ScannerLogin {

	public static void main(String[] args) {
			//创建一个对象
		     Scanner sc = new Scanner(System.in);
		     System.out.println("请输入QQ");
		     int qqName = sc.nextInt();//输入完成需要回车结束
		     System.out.println("输入的QQ为:"+qqName);
		     System.out.println("请输入密码:");
		     String pwd = sc.next();
		     System.out.println("密码是:"+pwd);
		     //关闭资源
		     sc.close();
	}

}
