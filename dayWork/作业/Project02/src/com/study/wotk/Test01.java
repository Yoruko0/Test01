package com.study.wotk;
/**
 * 运算符的使用
 * @author cly
 * @date 2023年11月27日
 */
public class Test01 {

	public static void main(String[] args) {
		//1.
		double fu = 177;
		double mu = 165;
		double er = (fu + mu) * 1.08 / 2;
		double nv = (fu * 0.923 + mu) / 2;
		System.out.println(er);
		System.out.println(nv);
		//2.
		int red = 21;
		int green = 24;
		if ((red * 2 + 3) == (green * 2)) {
			System.out.println("正确");
		}
       else {
		System.out.println("错误");
	  }
		//3.
		double fish = 24;
		double hsm = 8;
		double rice = 3;
		double sum = 16 + hsm + rice;
		double sum2 = (fish + hsm + rice) * 0.8;
		if (sum > sum2) {
			System.out.println("最少要花" + sum2 + "元");
		} else {
			System.out.println("最少要花" + sum + "元");
		}
	}

}
