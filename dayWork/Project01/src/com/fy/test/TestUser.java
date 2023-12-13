package com.fy.test;
/*创建项目自动帮我们创建有的文件夹,自己创建的包名,需要引入*/

//import com.fy.model.*;//*表示引入com.fy.model下的所有类
import com.fy.model.User;//.User引入类与引用*相比,运行*比单独指定引入的类要慢
import com.fy.util.ContextUtil;
import com.fy.util.DBUtil;

/**
 * 针对User类进行测试
 * @author cly
 * @date 2023年12月6日
 */
public class TestUser {
    
	//栈帧(main)
	public static void main(String[] args) {
		//调用账号密码
		System.out.println(ContextUtil.MYSQLNAME+","+ContextUtil.MYSQLPWD);
		new DBUtil();
		
		
		  //入栈:u1
	      //执行new之后,生成一个内存地址:@15db9742
		  User u1 = new User();//此对象就产生,成员变量全部初始化
		  
		  //直接写u1,写u1.toString()这两种方式,不写之下调用的就是toString()
		 // System.out.println(u1);//com.fy.model.User@15db9742
		  /*System.out.println(u1.name);
		  u1.codeing("1");*/
		  
		  //方法区(不变化)
		  /*
		   * 不变:
		   * 1.编译之后的class文件代码
		   * 2.静态static : 方法,变量
		   * 3.堆区中要拿取的赋值的字符串或其他类型的值
		   */
		  //给u1这个对象赋值
		  u1.name = "魔理沙";//会替换堆区初始化的值
		  u1.age = 18;
		  u1.sex = '女';
		  u1.tel = "114514";
		  u1.address = "幻想乡";
		  u1.codeing(u1.name);
		  
		  //打印取值
		  System.out.println(u1.name+","+u1.age);
		  System.out.println(u1);
		  
		  //入栈:u2
		  //运行后生成内存地址:@6d06d69c
		  User u2 = new User();
		  //System.out.println(u2);//com.fy.model.User@6d06d69c
		  u2.name = "丁真";
		  u2.age = 24;
		  u2.sex = '男';
		//  System.out.println("u2对象输出的值:"+u2.name+u2.age+","+u2.tel);
		  System.out.println(u2);
		
		//不同包之下的new对象
		//UserTest  userTest = new UserTest();//无参数的构造器(也叫构造方法),与类名称一样
		//System.out.println(name);
		  
	   //创建一个对象,调用带参数的构造器(构造方法)
		  
	  User  u3 = new User("芙蓉王源", 24, '寄', "114514", "下北泽沼气街");
	  System.out.println(u3);
	   
	  //调用带两个参数的构造器
	  User u4 = new User("骆驼丁真", 25);
	  System.out.println(u4);
	  
	  //调用不同的构造器:重载
	  //构造器:类名称一样,参数个数不同,若个数一样要求参数类型不同
	  
	  User u5 = new User(23,"二次元刀酱");
	  System.out.println(u5.toString());
	  
	  //同方法,不同调用方式,重载
	  u5.eat("fw");
	  u5.eat();
	  
	  System.out.println("---------------------调用set get 方法赋值取值--------------------------");
	  u5.setName("fw");
	 System.out.println(u5.getName());
	 
	 u1 = new User();
	 u2 = new User();
	 
	}
}
