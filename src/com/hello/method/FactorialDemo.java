package com.hello.method;

public class FactorialDemo {
	// 定义一个求n!的阶乘的方法
	public static int getFactor(int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num *= i;
		}
		return num;
	}

	public static void main(String[] args) {
		// 求1！+2！+3!+4!+5!
		int n = 5, num = 0, sum = 0;
		for (int i = 1; i <= n; i++) {
			num = FactorialDemo.getFactor(i);
			sum += num;
		}
		System.out.println("1!+2!+3!+4!+5!=" + sum);
	}

}
