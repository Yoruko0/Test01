package com.fy.array;
/**
 * 对旧数组进行扩容
 * @author cly
 * @date 2023年12月4日
 */
public class ArrayCopyTest {
	public  final static int CAPACITY = 2;//准备要扩容的倍数
	public static void main(String[] args) {
		String[] olaNames = {"初音","天依","镜音"};
		System.out.println("长度:"+olaNames.length);
	/*	names = new String[4];//把原来数据清空并赋值
		names[3] = "巡音";//编译出错ArrayIndexOutOfBoundsException
		*/
		String [] newNames = new String [olaNames.length *CAPACITY ];
		System.out.println("扩容之后的数组长度:"+newNames.length);
		//把旧数组的数据也复制到新数组newNames
		System.arraycopy(olaNames, 0, newNames, 0, olaNames.length);
		olaNames = newNames;//把新数组的长度大小给旧数组
	}

}
