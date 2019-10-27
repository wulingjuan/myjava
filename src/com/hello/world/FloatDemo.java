package com.hello.world;

public class FloatDemo {
	public static void main(String[] args) {
		//定义一个单精度浮点型变量，存放一个1234.328;
		float f = 1234.328f;
		System.out.println("f="+f);
		
		//定义一个双精度浮点型变量，存放一个5678.223；
		double d = 5678.223;
		System.out.println("d="+d);
		
		//将整型赋值给浮点型
		double d1 = 123;
		System.out.println("d1="+d1);//输出123.0
		
		//将变量赋值给变量
		double d2 = d;
		System.out.println("d2="+d2);
	}
}
