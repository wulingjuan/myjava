package com.hello.method;

public class Rectangle {
	//无参有返回值
	//求长方形的面积
	public int getArea() {
		int length=5,width=4;
		return length * width;
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		int area = rectangle.getArea();
		System.out.println("长方形的面积是："+area);
	}
	
	
}
