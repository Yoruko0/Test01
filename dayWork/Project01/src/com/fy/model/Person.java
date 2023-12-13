package com.fy.model;
/**
 * 封装类 : 人信息类
 *   成员变量 : 全部设置成private
 *   赋值或是取值 : set与get修饰符都是public
 * @author cly
 * @date 2023年12月12日
 */
public class Person {
		
	   //private:本类可以使用,同一个包下的类不可以使用,不同的包也不可以
	   //default:本类可以使用,同一个包下的类可以使用,不同的包下也不可以
	   //protect:本类可以使用,同一个包下的类可以使用,不同的包下也不可以进行使用
	   //public:整个项目之下都可以使用	
	
	private String name;
	private 	int age;
	private	char sex;
	private String  tel;
	
	//set,get就是方法
	public void setSex(char sex){//外部传递输入会引起不安全,高内聚
		if (String.valueOf(sex).equals("男") || String.valueOf(sex).equals("女")) {
			this.sex = sex;
		}
		else {
			System.err.println("输入有误,性别必须为男或女");
		}
	}
	public char getSex(){//低耦合
		return sex;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {//外部传递输入会引起不安全
		
		//假如传递过来的是身份证号,截取获得年月日
		
		if (age >=1 && age <=130) {//年龄范围
			this.age = age;
		}
		else {
			System.err.println("年龄必须在0-130之间");
		}
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
//	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", tel=" + tel + "]";
	}
	
	public static void main(String[] args) {
//		Person person = new Person();
//		person.name = "爱丽丝.玛格丽特";
//		person.age = 114;//不安全因素,赋值造成不安全
//		person.sex = '女';//性别要求必须填写值:男或女
	}

}
