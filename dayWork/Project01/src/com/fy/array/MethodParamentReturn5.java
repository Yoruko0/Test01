package com.fy.array;
/**
 * 把一个数组一个参数传递到方法里
 * 返回类型:8种类型,数组
 * @author cly
 * @date 2023年12月1日
 */
public class MethodParamentReturn5 {

	public static void main(String[] args) {
		/* int age = 18;
		 showUserOfAge(age);
		 
		 int [] ages = {16,18,17,20};//把ages当做方法的参数传递
		 showAges(ages);*/
		
		String user = getUser("t3-2");
		System.out.println(user);
		String [] names = getUserNames();
		int i = 0;
		for(String n : names){
			i++;
			System.out.println("第"+i+"个,姓名:"+n);
		}
	}
/**
 * 通过一个age获得用户信息
 * @param age 传递一个int类型的年龄
 */
	//private私有:本类中可以调用
	/*private static void showUserOfAge() {
		}*/
	public static void showUserOfAge(int age){//此方法名称只能定义一次
		System.out.println("年龄:"+age);
	}
	//返回String类型
	public static String getUser(String address) {
		String user = "";
		if (address.equals("t3-2")) {
			user = "魔理沙,t3-2";
		}else {
			user = "无";
		}
		return user;
	}
	//返回一组姓名
	public static String[] getUserNames() {
			String[] usernames =  {"灵梦","恋恋","琪露诺","露米娅","早苗","天子","风见幽香","八云紫"};
			return usernames;
	}
	/**
 * 显示所有年龄数据
 * @param ages 传递参数:年龄数组
 */
	public static void showAges(int [] ages) {//ages: 谁调用此方法传递的参数名称
		for (int age : ages) {
			System.out.println(age);
		}
	}
	

}
