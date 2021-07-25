package com.jizhong.pojo;

public class Dog {
	private String name;
	private int age;
	
	//空参构造
	//权限修饰符 类名(){}
	public Dog(){
		
	}
	
	//有参构造
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
	}
	

	//get方法：获取数据
	//set方法：设置数据
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//toString方法：打印对象中的属性信息
	@Override
	public String toString() {
		//Dog [name=大黄, age=0]
		return "狗类  名称是：" + name + ", 年龄是：" + age;
	}
	
	
	
	
	
	//权限修饰符 返回值类型 方法名称(){}
	public void eat(){
		System.out.println("狗吃骨头！！！");
	}

	

	
		
}
