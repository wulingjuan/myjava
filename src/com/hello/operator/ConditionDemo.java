package com.hello.operator;

public class ConditionDemo {

	public static void main(String[] args) {
		int a=4,b=7;
		//求a和b的最大值
		int max;
		max = a > b ? a : b;
		System.out.println("a和b的最大值为："+max);
		boolean m = a>b?(3<6|3<1):(true==false);
		System.out.println("m="+m);
	}

}
