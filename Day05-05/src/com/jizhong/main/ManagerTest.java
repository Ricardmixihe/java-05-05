package com.jizhong.main;

import java.util.Scanner;
import com.jizhong.pojo.Manager;

public class ManagerTest {
	public static void main(String[] args) {
		//1. 创建管理员对象
		Manager bai = new Manager();
		bai.setUsername("bai");
		bai.setPassword("123456");
		//2. 输入用户名 密码
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的用户名：");
		String username = sc.next();
		System.out.println ("请输入您的密码：");
		String password = sc.next();
		//3. 判断用户名和密码是否正确
		if(username.equals(bai.getUsername()) && password.equals(bai.getPassword())){
			//3.1 判断正确
			//正确：修改密码  打印信息
			System.out.println("请输入修改后的密码：");
			String newPassword = sc.next();//新密码
			bai.setPassword(newPassword);
			System.out.println(bai);
		}else{
			//3.2 判断错误
			//错误：提示密码错误
			System.out.println("您的用户名或者密码错误，请重新输入！！！");
		}
		sc.close();
	}
}
