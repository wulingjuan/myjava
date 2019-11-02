package com.hello.method;

public class MaxNumber {
	//有参无返回值
	//定义一个求两个float类型数据最大值的方法，在方法中将最大值打印输出
	public static void getMax(float a,float b) {
		if(a>b) System.out.println("最大值为:" +a);
		else System.out.println("最大值为："+b);
	}
	
	//方法重载
	public static void getMax(double a,double b) {
		if(a>b) System.out.println("最大值为:" +a);
		else System.out.println("最大值为："+b);
	}
	public static void main(String[] args) {
		MaxNumber.getMax(0.56f, 0.788f);
	}
}
