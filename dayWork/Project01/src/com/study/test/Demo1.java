package com.study.test;
/**
 * 面向过程(创建方法)
 * @author cly
 * @date 2023年11月24日
 */
public class Demo1 {
    //void不返回,main方法名称,参数类型String,参数名称：args
	public static void main(String[] args) {
		Game game = new Game();
		//此对象game不可调用私有方法(private),protect受保护的方法可以调用
		//game.downLoad();
		//main的{ }属于方法体
		//调用求和方法
		sum();
		sum2(114, 514);
		int result = sum3(10000, 20000);
		System.out.println(result);
	}
   //创建一个求和方法,给main方法调用
	public static void sum(){
		int sum1 = 5000;
		int sum2 = 6000;
		int sum3 = sum1 + sum2;
		System.out.println(sum3);
	}
	public static void sum2(int sum1,int sum2){
		System.out.println(sum1 + sum2);
	}
	public static int sum3(int sum1,int sum2){
		return sum1 + sum2;
	}
}
