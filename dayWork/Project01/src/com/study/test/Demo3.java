package com.study.test;
/**
 * 逻辑比较:
 * ! 取反,非      && 且        || 或
 * 把if改造成三目运算符
 * @author cly
 * @date 2023年11月27日
 */
public class Demo3 {

	public static void main(String[] args) {
					 int day = 2;
					 System.out.println(day  == 2);//true
					 System.out.println(day != 2);//false
					 if (day == 2) {//以判定结果进行比较:true或false
						System.out.println("喜");
					} else {
						System.out.println("寄");
					}
		//-----------------把前面的day != / == 2 修改成三目运算符--------------------------
					 System.out.println(day == 2 ? "喜" : "寄");
		//    		 条件判定 ? 成立结果 : 失败结果			 
					 System.out.println("--------------------------------------------------------------------");
					 
					String logname = "帕秋莉";//登录名称
					String dataLoginname ="帕秋莉";
							// "十六夜咲夜";//存储姓名
					//System.out.println(logname.equals(dataLoginname));
					String pwd = "d999";
					String dataPwd = "d999";
					//登录要求登录姓名与密码都要正确
					System.out.println(!logname.equals(dataLoginname));
					System.out.println(logname.equals(dataLoginname) && false);//只要有一个不为true,则输出false
					System.out.println((logname.equals(dataLoginname)) || (pwd.equals(dataPwd)));//只要有一个为true,结果为true
					if (logname.equals(dataLoginname)  && pwd.equals(dataPwd)) {//条件成立后,进入执行{ }方法体 
						System.out.println("登录成功");
					} else {//否则
									System.out.println("用户名或密码错误");
					}
					
					
					
					
	}

}
