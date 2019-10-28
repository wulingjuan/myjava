package com.hello.operator;

public class MathDemo1 {

	public static void main(String[] args) {
		//x++	先参与语句或一个方法运算再进行自增
		int x=4;
		int y=(x++)+5;
		System.out.println("x="+x+",y="+y);
		
		//++x的形式 	先进行自增再进行参与语句或一个方法运算
		x = 4;
		y=(++x)+5;
		System.out.println("x="+x+",y="+y);
		
		//x-- 先参与参与语句或一个方法运算再进行自减
		x = 4;
		y = (x--)+5;
		System.out.println("x="+x+",y="+y);
		
		//--x 先进行
		x=4;
		y =(--x)+5;
		System.out.println("x="+x+",y="+y);
	}

}
