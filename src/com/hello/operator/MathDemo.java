package com.hello.operator;

public class MathDemo {

	public static void main(String[] args) {
		int num1 = 10,num2 = 5;
		int result;//存放结果
		//加法
		result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		
		//字符串连接（从左往右依次执行）
		System.out.println(num1+num2);//数值进行运算
		System.out.println(""+num1+num2);//字符串连接
		
		//减法
		result = num1 -num2;
		System.out.println(num1+"-"+num2+"="+result);
		
		//除法
		result = 13 / 5; //如果分子分母都为整数时，结果为取整的值
		System.out.println("result="+result);
		System.out.println("13.0/5="+13.0/5);
		
		int a=3,b=4;
		double c = a/b;
		double d = (double)a / b;
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		int m = 3;
		m+=4;
		System.out.println("m="+m);
	
	}
}
