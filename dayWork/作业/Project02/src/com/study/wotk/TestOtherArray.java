package com.study.wotk;
/**
 * 数组扩容
 * @author cly
 * @date 2023年12月5日
 */
public class TestOtherArray {
	public static int CAPACITY = 2;//扩容倍数
	public static int INDEXLENTH = 0;//赋值大小
		public static void main(String[] args) {
			/**
			 * 步骤:1.定义数组
			 * 2.输入赋值大小
			 * 3.把赋值的大小和原数组长度进行判断
			 * 4.抽取公共扩容方法(定义方法)
			 * 5.在方法中定义新数组并赋值
			 * 6.把旧数组的数据赋值到新数组，并把新数组的长度返回给原数组
			 */
			String old[] = {"丁真","雪豹","瑞克"};//旧数组
			INDEXLENTH = 5 ;//赋值长度
			if (INDEXLENTH > old.length) {//旧数组长度判断
				old = setCapacity(old);//调用公共扩容方法
			}
			for (String val : old) {//输出扩容后的数组值
				System.out.println(val);
			}
		}
		public static String[] setCapacity(String[] old) {//公共扩容方法
			String newsz[] = new String[INDEXLENTH * CAPACITY];//定义新数组
			System.arraycopy(old, 0, newsz, 0, old.length);//旧数组数据赋值到新数组
			old = newsz;// 新数组长度大小赋给旧数组
			return old;//返回扩容后数组
		}
}
