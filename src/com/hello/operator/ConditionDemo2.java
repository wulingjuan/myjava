package com.hello.operator;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// �����ж�һ����������������ż�������������ӡ���
		//int n=13;
		//�Ӽ��̽�������
		System.out.println("������һ������");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		
		if(n%2==0) {
			System.out.println(n+"Ϊż��!");
		}else {
			System.out.println(n+"Ϊ����!");
		}

	}

}
