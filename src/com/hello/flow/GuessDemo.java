package com.hello.flow;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
		// 设置要猜的数
		int number=(int)(Math.random() * 10+1);
		int guess;
		do {
			System.out.println("请输入您猜测的数：");//使用随机数生成1-10之间的整数
			Scanner scanner = new Scanner(System.in);
			guess = scanner.nextInt();
			if(guess > number) {
				System.out.println("太大了！");
			}else if(guess < number) {
				System.out.println("太小了！");
			}else {
				scanner.close();
				System.out.println("恭喜您，猜中了！");
			}
		} while (guess != number);

	}

}
