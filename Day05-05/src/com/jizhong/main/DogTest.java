package com.jizhong.main;

import com.jizhong.pojo.Dog;

public class DogTest {
	public static void main(String[] args) {
		//创建对象
		//类名 对象名 = new 类名();
		//数据类型 变量名称 = 值;
//		Dog dahuang = new Dog();
//		dahuang.setName("大黄");//设置属性
//		System.out.println(dahuang);
		//com.jizhong.pojo.Dog@15db9742
		//Dog [name=大黄, age=0]
		//狗类  名称是：大黄, 年龄是：0
		
		//String name,int age
		Dog dog = new Dog("大黄",16);
		System.out.println(dog);
		
		
	}
}
