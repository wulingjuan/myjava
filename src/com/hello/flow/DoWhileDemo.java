package com.hello.flow;

public class DoWhileDemo {
	public static void main(String[] args) {
		// 求1到5的累加和
		int n = 0;
		int sum = 0;
		do {
			sum += n;
			n++;
		} while (n <= 5);
		System.out.println(sum);
	}
}
