package com.fy.iftest;
/**
 * 使用三目运算符判定输出性别
 * @author cly
 * @date 2023年11月28日
 */
public class IfSex {

	public static void main(String[] args) {
		// 0表示是男,1表示是女
		int sexNum = 0;
	    System.out.println(getSexByNum(sexNum));
	}
	public static String getSexByNum(int sexNum) {
		String sexval = (sexNum == 0 ? "男" : "女");
		return sexval;
		
	}

}
