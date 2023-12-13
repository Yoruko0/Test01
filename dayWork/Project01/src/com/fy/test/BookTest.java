package com.fy.test;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 当当平台购买图书流程
 * @author cly
 * @date 2023年11月29日
 */
public class BookTest {
	//临时存放图书名称
	static String dataBook1 = "1.萝球部";
	static String dataBook2 = "2.妹妹人生";
	static String dataBook3 = "3.剃须,然后捡到女高中生";
	//临时存储账号与密码
	static String DATANAME = "cly";
	final static String DATAPWD = "114514";
	static Scanner scanner =  new Scanner(System.in);
	
	public static void main(String[] args) {
		   getRun();
		   bookList();
		String searchName = getBookName();
		String result = BookName(searchName);
		System.out.println(result);
		//加入购物车
		boolean flag = addCar(searchName);
		boolean payFlag = false;//false没有结算,true可以进行操作结算
		  if (flag) {
			System.out.println(searchName + "已添加购物车");
			payFlag = true;
		}
		  else {
			System.out.println(searchName + "没有添加购物车");
		}
		 //结算
		  if (payFlag) {//true调用结算
			doPayFlag(result);//判定登录进行支付
		}
		  else {
			System.out.println("没有做结算操作");
		}
		  
		 //colse关闭资源
		close();
	}
	    //1.访问平台
		public static void getRun() {
			System.out.println("欢迎进入当当网");
		}
		//2.有图书列表
		public static void bookList() {
			System.out.println("----------------图书列表-----------------------");
			System.out.println("1.萝球部");
			System.out.println("2.妹妹人生");
			System.out.println("3.剃须,然后捡到女高中生");
		}
		//3.在搜索框里搜索图书,有则打印出来,，没有则返回提示
		public static String BookName(String searchName) {
			String msg = "没有找到与" + "<<" +searchName + ">>" + "有关的相关信息";
			if (dataBook1.contains(searchName)) {
				msg = "1.萝球部,$90,作者:苍山探";
			}
			else if (dataBook2.contains(searchName)) {
				msg = "2.妹妹人生,$75,作者:入间人间";
			}
			else if (dataBook3.contains(searchName)) {
				msg = "3.剃须,然后捡到女高中生,$80,作者:醋青鱼";
			}
			return msg;
		}
		//4.输入框输入图书,返回main方法中
		public static String getBookName() {
			System.out.println("请输入查询的信息:");
			Scanner scanner = new Scanner(System.in);
			String searchName = scanner.next();
			return searchName;
		}
		public static void close() {
			scanner.close();
		}
		//5.加入购物车
		public static boolean addCar(String searchName) {
			return (searchName != null && !"".equals(searchName)) ? true : false;
		}
		//6.结算(要求看是否登录true)
		public static void doPayFlag(String result) {
			
			if (doLogin()) {//true登录成功,false登录失败
						System.out.println(DATANAME+"登录成功,请进行支付操作");
						truePay(result);
					} 
			}
		//7.登录功能
		public static boolean doLogin() {
			System.out.println("进入登录界面");
			System.out.println("请输入用户名:");
			String username = scanner.next();
			System.out.println("请输入密码:");
			String password = scanner.next();
			boolean loginFlag = false;//false没有登录成功,true登录成功
			if ((username == null || "".equals(username))) {
				System.out.println("用户名不能为空");
			}
			else if ((password == null || "".equals(password))) {
				System.out.println("密码不能为空");
			}
			else if (username.equals(DATANAME) && password.equals(DATAPWD)) {
					loginFlag = true;
			}	
			return loginFlag;
		}
		//8.支付
		public static void truePay(String result) {
			System.out.println("进入支付界面");
			System.out.println(result);//拿到的是具体的价格
			//System.out.println(result.substring(,));
			System.out.println("请输入要支付的价格");
			//从订单信息里截取价格
			double dataPrice = Double.valueOf(result.substring(result.indexOf("$") + 1, result.lastIndexOf(",")));
			double price = scanner.nextDouble();
			if (price == dataPrice) {
				System.out.println("成功支付,数额为"+price+"元");
				//生成订单信息
				info(result);
			}
			else {
				System.out.println("请重新支付");
			}
		}
		//9.订单信息(随机)
		public static void info(String result) {
				System.out.println(DATANAME+"你购买:"+result+",你的订单号为:G" + System.currentTimeMillis());
		}
}

