package com.fy.array;
/**
 * 对旧数组进行扩容
 * 抽取扩容方法
 * 当遇到赋值大小超过数组的长度就调用扩容方法
 * @author cly
 * @date 2023年12月4日
 */
public class ArrayCopyTest7 {
	public  final static int CAPACITY = 2;//准备要扩容的倍数
	public  static int INDEXLENGTH = 0;
	public static void main(String[] args) {	
		String[] oldNames = {"初音","天依","镜音"};
		System.out.println("长度:"+oldNames.length);
		//当遇到赋值大小超过数组的长度就调用扩容方法
		//int indexval = 10 ;
		INDEXLENGTH = 10;
		if (INDEXLENGTH >= oldNames.length) {
			oldNames=setCapacity(oldNames);
			oldNames [INDEXLENGTH] = "巡音";
		}
		for (String val : oldNames) {
			System.out.println(val);
		}
	/*	names = new String[4];//把原来数据清空并赋值
		names[3] = "巡音";//编译出错ArrayIndexOutOfBoundsException
		*/	
	}
		//抽取公共扩容方法
		public static String []  setCapacity(String[] oldNames) {
			String [] newNames = new String [INDEXLENGTH *CAPACITY ];
			System.out.println("扩容之后的数组长度:"+newNames.length);
			//把旧数组的数据也复制到新数组newNames
			System.arraycopy(oldNames, 0, newNames, 0, oldNames.length);
			oldNames = newNames;//把新数组的长度大小给旧数组
			return oldNames;
		}
}
