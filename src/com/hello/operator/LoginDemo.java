package com.hello.operator;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		// ����һ������
		System.out.println("������һ��������");
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		if(!(n%3==0)) {
			System.out.println(n+"���ܱ�3������");
		}else {
			System.out.println(n+"�ܱ�3������");
		}
		
		if(n++ > 10) {
			int m=n++;
			System.out.println(n);
			System.out.println(m);
		}

	}

}
