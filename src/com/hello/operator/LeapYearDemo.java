package com.hello.operator;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// �������ܱ�4������100��������ݻ������ܱ�400���������
		System.out.println("������һ�����");
		Scanner scanner = new Scanner(System.in);
		int year=scanner.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year+"������");
		}else {
			System.out.println(year+"��������");
		}	
		
		System.out.println("������һ������");
		// ����һ�����ͱ���n�����Ӽ��̽�������
	    int n = scanner.nextInt();
	    scanner.close();
		//�ж�n�Ƿ�ͬʱ�ܱ�5��7��������������������yes���������no
		if(n%5==0 && n%7==0){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}

	}

}
