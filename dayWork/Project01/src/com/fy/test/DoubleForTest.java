package com.fy.test;
/**
 * for循环嵌套输出直角三角形
 * @author cly
 * @date 2023年11月30日
 */
public class DoubleForTest {

	public static void main(String[] args) {
		for( int i = 1  ; i <= 9 ; i++){//第一个for:控制行数
			//System.out.println("第"+i+"行");
			//第二个for循环(内层for),为了控制一行显示多少个值
			for(int j = 1 ; j <= i ; j++){
				System.out.print("*\t");
			}
			System.out.println("");//换行
		}
	}

}
