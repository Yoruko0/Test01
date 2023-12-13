package com.fy.array;
/**
 * 创建数组:使用new关键字
 * @author cly
 * @date 2023年11月30日
 */
public class Demo1 {

	public static void main(String[] args) {
		String name = "芙兰";
		String name2 = "蕾米";
		//存放多个姓名,使用数组的方式
		String [] names;//声明一个数组
		names = new String[2];
		String[]	StudentsNames = new String[2];//需要初始化,只能存两个位置
		//给数组赋值
		StudentsNames [0] = "古明地恋";
		StudentsNames [1] = "古明地觉";
		//StudentsNames [2] = "蓬莱山辉夜";//存入第三个位置,Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
		//为数组越界
		System.out.println("---------------姓名输出----------------");
		for (int i = 0; i < StudentsNames.length; i++) {
			String string = StudentsNames[i];
			System.out.println(string);
		}
		System.out.println("-------------结束-------------------");
		System.out.println(names);//[Ljava.lang.String;@15db9742,内存地址分配一个空间
		System.out.println(StudentsNames);
		
/*		String[] pros = new String[3];//索引位置:0,1,2
		pros [0] = "红魔馆";
		pros [1] = "白玉楼";
		pros [2] = "星莲船";*/
		String [] pros = {"红魔馆","白玉楼","星莲船","地灵殿","神灵庙"};//
		//取值
		System.out.println(pros[2]);
		System.out.println(pros[3]);
		//System.out.println(pros[3]);//如果取值不存在的索引位置,则会报异常错误:ArrayIndexOutOfBoundsException
		
		//获得数组pros得到大小
		System.out.println("pros的数组的size:"+pros.length);//获得当前地点数组的长度:4个
		System.out.println("size:"+StudentsNames.length);
		//希望把数组里所有的值全部打印out
	/*	System.out.println("-----------手动输出---------------");
		System.out.println(pros[0]);
		System.out.println(pros[1]);
		System.out.println(pros[2]);
		System.out.println(pros[3]);*/
		
		System.out.println("-----------------for循环输出--------------------");
		for(int i = 0 ; i < (pros.length) ; i++){
			System.out.println(pros[i]);
		}

	}

}
