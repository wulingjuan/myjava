package com.hello.method;

public class MaxNumber {
	//�в��޷���ֵ
	//����һ��������float�����������ֵ�ķ������ڷ����н����ֵ��ӡ���
	public static void getMax(float a,float b) {
		if(a>b) System.out.println("���ֵΪ:" +a);
		else System.out.println("���ֵΪ��"+b);
	}
	
	//��������
	public static void getMax(double a,double b) {
		if(a>b) System.out.println("���ֵΪ:" +a);
		else System.out.println("���ֵΪ��"+b);
	}
	public static void main(String[] args) {
		MaxNumber.getMax(0.56f, 0.788f);
	}
}
