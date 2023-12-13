package com.study.test;
/**
 * 操作游戏类
 * @author cly
 * @date 2023年11月24日
 */
public class Game {
    public static void main(String[] args) {
		/*
		 * 编写游戏操作过程
		 * 1.下载
		 * 2.安装
		 * 3.打开
		 * 4.注册
		 * 5.登录
		 * 6.选择服务器
		 * 7.创建角色
		 * 8.充钱
		 * 9.卸载
		 */
    	downLoad();
    	install();
    	open();
    	rdgistred();
    	login();
    	server();
    	createPlayer();
    	pay();
    	uninstall();
	}
    //1.下载游戏
    protected static void downLoad() {
           System.out.println("下载");		
	}
    //2.安装游戏
    public static void install() {
    	System.out.println("安装");
		
	}
    //3.打开游戏
    public static void open() {
    	System.out.println("打开");
		
	}
    //4.注册账号
    public static void rdgistred() {
		System.out.println("注册");
	}
    //5.登录游戏
    public static void login() {
    	System.out.println("登录");
		
	}
    //6.选择服务器
    public static void server() {
		System.out.println("选择服务器");
	}
    //7.创建角色
    public static void createPlayer() {
    	System.out.println("创建角色");
		
	}
    //8.充钱
    public static void pay() {
		System.out.println("充钱");
	}
    //9.辣鸡游戏,建议卸载
    public static void uninstall() {
    	System.out.println("辣鸡游戏,卸载");
		
	}
}
