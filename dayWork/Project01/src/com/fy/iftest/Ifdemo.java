package com.fy.iftest;
/**
 * 条件判定:
 *   if
 * @author cly
 * @date 2023年11月28日
 */
public class Ifdemo {

	public static void main(String[] args) {
				double startTime = 16.00;
				double personTime = 15.40;
				String tickNo = "k332";
				if (personTime < startTime) {
					System.out.println("可以上车");
				}
				else {
					System.out.println("改签"+tickNo+"次列车");
				}
	}

}
