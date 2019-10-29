package com.hello.flow;

import java.util.Scanner;

public class WeekDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个1-7之间的数字");
		int n=scanner.nextInt();
		switch (n) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("该数字超出了1-7的范围");
			break;
		}

		System.out.println("请输入一个英文单词：");
		String s=scanner.next();
		scanner.close();
		switch (s) {
		case "MonDay":
			System.out.println("星期一");
			break;
		case "TuesDay":
			System.out.println("星期二");
			break;
		case "WedensDay":
			System.out.println("星期三");
			break;
		case "ThursDay":
			System.out.println("星期四");
			break;
		case "Friday":
			System.out.println("星期五");
			break;
		case "Saturday":
			System.out.println("星期六");
			break;
		case "Sunday":
			System.out.println("星期天");
			break;
		default:
			System.out.println("单词输入错误");
			break;
		}
	}

}
