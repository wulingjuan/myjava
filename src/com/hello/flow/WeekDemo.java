package com.hello.flow;

import java.util.Scanner;

public class WeekDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��1-7֮�������");
		int n=scanner.nextInt();
		switch (n) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("�����ֳ�����1-7�ķ�Χ");
			break;
		}

		System.out.println("������һ��Ӣ�ĵ��ʣ�");
		String s=scanner.next();
		scanner.close();
		switch (s) {
		case "MonDay":
			System.out.println("����һ");
			break;
		case "TuesDay":
			System.out.println("���ڶ�");
			break;
		case "WedensDay":
			System.out.println("������");
			break;
		case "ThursDay":
			System.out.println("������");
			break;
		case "Friday":
			System.out.println("������");
			break;
		case "Saturday":
			System.out.println("������");
			break;
		case "Sunday":
			System.out.println("������");
			break;
		default:
			System.out.println("�����������");
			break;
		}
	}

}
