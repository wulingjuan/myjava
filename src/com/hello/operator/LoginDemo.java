package com.hello.operator;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		// 输入一个整数
		System.out.println("请输入一个整数：");
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		if(!(n%3==0)) {
			System.out.println(n+"不能被3整除！");
		}else {
			System.out.println(n+"能被3整除！");
		}
		
		if(n++ > 10) {
			int m=n++;
			System.out.println(n);
			System.out.println(m);
		}

	}

}
