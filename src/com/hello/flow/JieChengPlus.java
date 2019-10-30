package com.hello.flow;

public class JieChengPlus {
	public static void main(String[] args) {
		// 求1!+2!+3!+4!+...20!
		long sum = 0;
		int n = 1;
		for (int i = 1; i <= 20; i++) {
			n=1;  //最重要的一步，不然会再内层循环之后再进行操作
			for (int j = 1; j <= i; j++) {
				n *= j;
			}
			sum += n;
		}
		System.out.println(sum);//如果值太大了，则会显示负数，超过长整型的表示范围
	}
}
