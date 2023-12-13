package com.fy.util;
/**
 * 测试本地Static静态代码块
 * @author cly
 * @date 2023年12月11日
 */
public class DBUtil {
	
	//连接名称账号和密码(以连接数据库存账号名和密码)
//	public final static String MYSQLNAME = "root";
//	public final static String MYSQLPWD = "local_host";
	
	static{//静态代码块只会执行一次
		System.out.println("静态代码...");
		System.out.println("账号:"+ContextUtil.MYSQLNAME+",密码:"+ContextUtil.MYSQLPWD);
	}
	
	public static void runStaticMethod(){
		System.out.println("进入执行runStaticMethod");
	}
	
	public static void main(String[] args) {
		
		//只是纯粹运行main方法,已经启动调用static{}
		runStaticMethod();//如果调用静态方法,先查找是否static{}代码块,如有则先执行static{}
		
		//手动方式清除
	   DBUtil dbUtil = new DBUtil();
		
	}

}
