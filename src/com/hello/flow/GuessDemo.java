package com.hello.flow;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
		// ����Ҫ�µ���
		int number=(int)(Math.random() * 10+1);
		int guess;
		do {
			System.out.println("���������²������");//ʹ�����������1-10֮�������
			Scanner scanner = new Scanner(System.in);
			guess = scanner.nextInt();
			if(guess > number) {
				System.out.println("̫���ˣ�");
			}else if(guess < number) {
				System.out.println("̫С�ˣ�");
			}else {
				scanner.close();
				System.out.println("��ϲ���������ˣ�");
			}
		} while (guess != number);

	}

}
