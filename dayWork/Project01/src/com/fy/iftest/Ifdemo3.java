package com.fy.iftest;
/**
 * 条件判定:
 *   if
 * @author cly
 * @date 2023年11月28日
 */
public class Ifdemo3 {

	public static void main(String[] args) {
				double startTime = 16.00;
				double personTime = 17.40;
				String tickNo = "k970";
				//boolean flag = false;//false不需要改签,true需要改签
				boolean flag = (tickNo.isEmpty() ? true : false);
				if (personTime < startTime) {
					System.out.println("可以上车");
				}
				else {
					if (!flag) {
						System.out.println("改签"+tickNo+"次列车");
					}
					else {
						System.out.println("不需要改签");
					}
					
				}
	}

}
