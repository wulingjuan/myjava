package com.hello.flow;

import java.util.Scanner;

public class ScoreAssess {

	public static void main(String[] args) {
		/*
		 * 
		�ɼ����ڵ���90�֣�������š�
		�ɼ����ڵ���80����С��90�֣����������
		�ɼ����ڵ���60��С��80�֣�������С�
		�ɼ�С��60�֣������������
		*/
		
		System.out.println("����һ��ѧ���ɼ���");
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();
		scanner.close();
		if(score>=90) {
			System.out.println("��");
		}else if(score>=80 && score<90) {
			System.out.println("��");
		}else if(score>=60 && score<80) {
			System.out.println("��");
		}else {
			System.out.println("������");
		}
	}

}
