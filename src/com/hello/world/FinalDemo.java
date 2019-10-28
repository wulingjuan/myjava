package com.hello.world;

public class FinalDemo {

	public static void main(String[] args) {
		// 常量不可被修改，一般大写、两个单词之间用下划线隔开    
		int m=6;
		final int M=6;
		System.out.println(m+M);
		m = 10;
		final double PI=3.14;
		final double MIN_VALU=0;
		System.out.println(PI+MIN_VALU);
	}

}
