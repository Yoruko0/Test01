package com.fy.test;

import com.fy.model.Person;

/**
 * 测试封装类
 * @author cly
 * @date 2023年12月12日
 */
public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("爱丽丝.玛格丽特");
		person.setAge(18);
		person.setSex('女');
//		System.out.println("姓名:"+person.getName()+"\t年龄:"+person.getAge()+"\t性别:"+person.getSex());
		System.out.println(person.toString());
		
		
	}

}
