package com.study.test;

import com.study.until.DB;

/**
 * 
 * @author cly
 * @date 2023年11月24日
 */
public class Shop {
	
	public static void main(String[] args) {
		 /* DB db = new DB();
          db.username = "999";*/
		//类名称,定义的static的成员变量DB.pssword
		System.out.println(DB.PASSWORD);
		//DB.PASSWORD = "6";// final字段不能进行二次赋值
	}

}
