package com.hello.flow;

public class DoWhileDemo {
	public static void main(String[] args) {
		// ��1��5���ۼӺ�
		int n = 0;
		int sum = 0;
		do {
			sum += n;
			n++;
		} while (n <= 5);
		System.out.println(sum);
	}
}
