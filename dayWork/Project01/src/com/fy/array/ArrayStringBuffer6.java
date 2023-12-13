package com.fy.array;
/**
 * 数组得到进行追加
 * @author cly
 * @date 2023年12月1日
 */
public class ArrayStringBuffer6 {

	public static void main(String[] args) {
			//使用一个类进行追加字符串
		StringBuffer names = new StringBuffer();
	/*	names.append("妖梦,");
		names.append("圣白莲,");
		names.append("莉莉白,").append("幽幽子,").append("射命丸文");//.append(b);//源码:返回的是this当前这个对象,链式方法
		System.out.println(names);
			*/
		String[] results = showNames();
		for (String n : results){
			names.append(n+",");//把数组的数据追加到names
		}
		System.out.println(names);
		//start包含索引位置,end不包含此索引位置
		System.out.println(names.substring(0, names.length()-1));
		System.out.println(names.substring(0, names.indexOf("梦")));
		System.out.println("截取之后的输出:"+names.substring(0, names.lastIndexOf(",")));
	}
	public static String[] showNames() {
		String[] names = {"妖梦","圣白莲","莉莉白","幽幽子","射命丸文"};
		return names;
	}

}
