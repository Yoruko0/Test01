package com.fy.scanner;

import java.util.Scanner;

/**
 * 学习使用Scanner类
 *  next与nextLine使用方式与区别
 * @author cly
 * @date 2023年11月28日
 */
public class ScannerLoginNextLine {

	public static void main(String[] args) {
			//创建一个对象
		     Scanner sc = new Scanner(System.in);
		     System.out.println("请输入昵称:");
		     String name = sc.nextLine();//有空格可以全部得到,遇到回车键视为结束
		    		 //sc.next();//next遇到空格视为结束,空格后的信息无法获得
		     System.out.println("输入的昵称为:"+name);
		     System.out.println("请输入QQ");
		     int qqName = sc.nextInt();//输入完成需要回车结束
		     System.out.println("输入的QQ为:"+qqName);
		     System.out.println("请输入密码:");
		     String pwd = sc.next();
		     System.out.println("密码是:"+pwd);
		     String replace = name.replaceAll("后藤","伊地知").replaceAll(" ", "");
		     System.out.println("替换之后:"+replace);
		     if (replace != null && !" ".equals(replace)) {
		    	 		System.out.println("注册成功");
		    	 		System.out.println("可继续操作");
			}
		     else {
				System.out.println("注册失败");
			}
		     //关闭资源
		     sc.close();
	}

}
