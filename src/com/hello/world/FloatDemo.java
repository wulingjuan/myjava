package com.hello.world;

public class FloatDemo {
	public static void main(String[] args) {
		//����һ�������ȸ����ͱ��������һ��1234.328;
		float f = 1234.328f;
		System.out.println("f="+f);
		
		//����һ��˫���ȸ����ͱ��������һ��5678.223��
		double d = 5678.223;
		System.out.println("d="+d);
		
		//�����͸�ֵ��������
		double d1 = 123;
		System.out.println("d1="+d1);//���123.0
		
		//��������ֵ������
		double d2 = d;
		System.out.println("d2="+d2);
	}
}
