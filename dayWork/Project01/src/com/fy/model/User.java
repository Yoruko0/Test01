package com.fy.model;
/**
 * 创建学生类的类(一张图纸)
 * 		成员变量
 * 			方法
 * @author cly
 * @date 2023年12月6日
 */
public class User {//class类上面设置其他修饰符只能设置:默认default,公共public,class只能有一个公共的public修饰的类,不能使用static修饰
	//[默认default,受保护protected,私有private.公共public]
	//创建属性,字段,成员变量
	//public static String name = "灵梦";
	
	//堆区
	//栈区执行new之后,会生成一个内存地址,堆区会进行寻址
	//第一次:初始化操作
	//第一次初始化后的变量或方法会存放在堆区中
	//不断的寻址,执行赋值与调用方法操作
	public String name = "灵梦";
	public int age;
	public char sex;
	public String tel;
	public String address;//地址
	private static String IDcard = "1145141919810";
	//-------------------------------------------------------
	
	//封装类有:set get成对出现
	
	//赋值
	public void setName(String name){
		this.name = name;
	}
	
	//取值
	public String getName(){
		return name;
	}
	
	public void codeing(String name){//传递一个参数
			System.out.println(name+"正在编写代码...");//名称一样:没有写传递参数,名字一样,找类中的name;若有传递参数,直接调用传递参数名称
			//System.out.println(this.name);
			//this这个,指的是当前的对象
	}
	
	//静态方法在方法区中,堆区中可以调用方法区中有的,反之则不行(不可以调用类中普通方法)
	public static void doMethod() {
//		coding(); coding()是堆区方法,无法被静态方法调用
//		只要new之后m,this这个对象就产生
//		User user = new User();
//		user.eat();
		doMethod2();//静态方法可以调用静态的修饰符设置
		System.out.println(IDcard);
	}
	
	public static void doMethod2() {
		System.out.println("进入doMethod2....");
	}
	

	
	//方法重载
	
	public void eat(){
		String food = "老八秘制汉堡";//局部变量food只能在eat方法中使用
		System.out.println(food);
	}
	public void eat(String food){
		System.out.println("获得带参数的eat方法:"+food);
	}
	
	public void eat(int num){
		System.out.println(num+"个");
		//this.codeing("zs");//this当前对象,调用方法时,this这个关键字可以不用写
		System.out.println(this.name);
	}
	
	//重写父类的方法:   父类    public String toString() {
	//重写:方法名称必须与父类方法名称一样,返回类型也要求一致
//	@Override
//	public String toString() {
//		return "User [name=" + name + ", age=" + age + ", sex=" + sex + ", tel=" + tel + ", address=" + address + "]";
//	}

	//@Override
//	public String toString1() {
//		return "User [name=" + name + ", age=" + age + ", sex=" + sex + ", tel=" + tel + ", address=" + address + "]";
//	}
	//带所有参数的构造器
	public User(String name, int age, char sex, String tel, String address) {
//		this(sex, tel, address);//调用构造方法不能写在代码的最后面,要写在构造器的第一行
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.tel = tel;
		this.address = address;
//		this();
//		super();//不能写在代码最后面,必须要求写在构造器的第一行,如果不写,编译器会加上此行(隐式编写)
	}
	
	public User(char sex, String tel, String address) {
		this.sex = sex;
		this.tel = tel;
		this.address = address;
	}
	

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public User(int age,String name) {
	//	return;//如果return后面有代码,不能放置在第一行,报错
		this.age = age;
		this.name = name;
	}
	
	public User() {
		
	}
	
	
	
	//创建带参数的构造方法:方法名与类名称必须一致
//	public User(String name,int age,char sex,String tel,String address){
//		System.out.println(name);//输出的是传递的参数的值
//		//需要赋值
//		this.name = name;//this.name是当前类成员变量的值,name是当前构造方法的参数值,所以,this.name = name 意为将name的参数值赋给当前类成员变量
//		this.age = age;
//		this.sex = sex;
//		this.tel = tel;
//		this.address = address;		
//	}
//	public User(String name,int age){
//		System.out.println(name);//输出的是传递的参数的值
//		//需要赋值
//		this.name = name;//this.name是当前类成员变量的值,name是当前构造方法的参数值,所以,this.name = name 意为将name的参数值赋给当前类成员变量
//		this.age = age;
////		this.sex = sex;
////		this.tel = tel;
////		this.address = address;		
//	}
	
//	public User(int age,String name){
//		System.out.println(name);//输出的是传递的参数的值
//		//需要赋值
//		this.age = age;
//		this.name = name;//this.name是当前类成员变量的值,name是当前构造方法的参数值,所以,this.name = name 意为将name的参数值赋给当前类成员变量
//	}
	/**
	 * 个数一样:同类型也不可以
	 */
//	public User(String name ,String tel){
//		this.tel = tel;
//		this.name = name;
//	}
//		
//	public User(String tel , String address){
//		this.address = address;
//		this.tel = tel;
//	}
	//无参构造方法(构造器)
//	public User(){
//		
//	}
	
	//重写toString方法,从object类
/*	@Override
	public String toString() {
		return "114514";	
	}*/
	/**
	 * 手动创建拼接数据输出
	 */
/*	@Override
	public String toString() {
		return "["+name+","+age+","+address+"]";
	}*/
	
	
//	public static void main(String[] args) {
//		//直接调用引用属性或是方法,只能静态的方法或是静态属性
//		//不是静态修饰的,只能通过实例化(new对象),就会在内存地址中已经产生一个地址(寻址)
//		
//		//创建不同的人
//		  User u1 = new User();//此对象就产生,成员变量全部初始化
//		  //直接写u1,写u1.toString()这两种方式,不写之下调用的就是toString()
//		  System.out.println(u1);//com.fy.model.User@15db9742
//		  /*System.out.println(u1.name);
//		  u1.codeing("1");*/
//		  //给u1这个对象赋值
//		  u1.name = "魔理沙";
//		  u1.age = 18;
//		  u1.sex = '女';
//		  u1.tel = "114514";
//		  u1.address = "幻想乡";
//		  
//		  //打印取值
//		  System.out.println(u1.name+","+u1.age);
//		  
//		  User u2 = new User();
//		  System.out.println(u2);//com.fy.model.User@6d06d69c
//		  u2.name = "丁真";
//		  u2.age = 24;
//		  u2.sex = '男';
//		  System.out.println("u2对象输出的值:"+u2.name+u2.age+","+u2.tel);
//		
//		//不同包之下的new对象
//		//UserTest  userTest = new UserTest();//无参数的构造器(也叫构造方法),与类名称一样
//		//System.out.println(name);

//	}

}

