package com.fy.array;
/**
 * 增强版for循环
 * @author cly
 * @date 2023年12月1日
 */
public class ForEach3 {

	public static void main(String[] args) {
		int [] ints = {114,514,1919,810};
		System.out.println("---------------普通for循环取值------------------");
		for (int i = 0; i < ints.length; i++) {//普通for循环取值
			System.out.println(ints[i]);
		}
		System.out.println("------------------增强版for循环--------------------");
		for(int num : ints){
			System.out.println(num);
			String [] pros = {"江苏省","安徽省"};
			for (String sf : pros) {
				System.out.println(sf);
			}
		}

	}

}
