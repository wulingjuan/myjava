package com.hello.method;

public class AreaDemo {
	//��Բ�����
	public double getArea(double r) {
		return Math.PI *Math.pow(r, 2);
	}
	//�󳤷������
	public double getArea(double l,double w) {
		return l*w;
	}
	public static void main(String[] args) {
		AreaDemo demo = new AreaDemo();
		System.out.println("Բ�����Ϊ��"+demo.getArea(4.5));
		System.out.println("�����ε����Ϊ��"+demo.getArea(8,5));

	}

}
