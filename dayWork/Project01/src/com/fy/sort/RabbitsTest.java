package com.fy.sort;
/**
 * 斐波那契数列
 * Fn = F(n-2)+F(n-1)
 * @author cly
 * @date 2023年12月5日
 */
public class RabbitsTest {

	public static void main(String[] args) {
		/**
		 * 经典兔子问题
		 */
		int month = 12;
		int rabbit[] = new int[month];
		rabbit[0] = 1;
		rabbit [1] = 1;
		for(int i = 2 ; i  < rabbit.length ; i++){
			rabbit[i] = rabbit [i-2] + rabbit[i-1];
			System.out.println("第"+i+"个月"+"兔子的数量为:"+rabbit[i]);
		}

	}

}
