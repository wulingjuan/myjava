package com.hello.operator;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// 闰年是能被4整除和100整除的年份或者是能被400整除的年份
		System.out.println("请输入一个年份");
		Scanner scanner = new Scanner(System.in);
		int year=scanner.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year+"是闰年");
		}else {
			System.out.println(year+"不是闰年");
		}	
		
		System.out.println("请输入一个整数");
		// 定义一个整型变量n，并从键盘接收数据
	    int n = scanner.nextInt();
	    scanner.close();
		//判断n是否同时能被5和7整除，如果满足条件输出yes，否则输出no
		if(n%5==0 && n%7==0){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}

	}

}
