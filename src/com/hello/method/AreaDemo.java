package com.hello.method;

public class AreaDemo {
	//求圆形面积
	public double getArea(double r) {
		return Math.PI *Math.pow(r, 2);
	}
	//求长方形面积
	public double getArea(double l,double w) {
		return l*w;
	}
	public static void main(String[] args) {
		AreaDemo demo = new AreaDemo();
		System.out.println("圆的面积为："+demo.getArea(4.5));
		System.out.println("长方形的面积为："+demo.getArea(8,5));

	}

}
