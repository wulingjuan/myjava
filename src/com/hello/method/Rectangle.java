package com.hello.method;

public class Rectangle {
	//�޲��з���ֵ
	//�󳤷��ε����
	public int getArea() {
		int length=5,width=4;
		return length * width;
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		int area = rectangle.getArea();
		System.out.println("�����ε�����ǣ�"+area);
	}
	
	
}
