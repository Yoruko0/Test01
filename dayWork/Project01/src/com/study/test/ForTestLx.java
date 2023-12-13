package com.study.test;
/**
 * for循环求1至100所有偶数
 * @author cly
 * @date 2023年11月30日
 */
public class ForTestLx {

	public static void main(String[] args) {
		int os = 0;
		for (int i = 1; i <= 100; i++) {
			if ( i % 2 == 0 ) {
				os += 1;
			}
		}
		System.out.println("有"+os+"个偶数");
	}

}
