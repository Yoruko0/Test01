package com.study.test;



/**
 * 算数运算符
 * @author cly
 * @date 2023年11月24日
 */
public class Num1 {

	public static void main(String[] args) {
		//+,-,*,/,%,++,--
		mul(5, 14);
		rem(9, 6);
		//Auto_add();
		selfDel();
	}
	//静态方法
	//++
	public static void Auto_add() {
		int a = 10;
		a++;//后++
		System.out.println(a);
		//++a;//前++
		//System.out.println(++a);前+1,输出12
		System.out.println(a++);//后+1,输出11
	}
	//--
	private static void selfDel() {
		int b = 10;
		//System.out.println(b--);10
		//System.out.println(b);9
		//System.out.println(--b);8
	}
	//做乘法运算
	public static void mul(int a,int b) {
		System.out.println("积:" + a * b);
	}
	public static void rem(int a,int b) {
		System.out.println("余数:" + a % b);
	}

}
