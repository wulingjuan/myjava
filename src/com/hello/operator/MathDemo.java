package com.hello.operator;

public class MathDemo {

	public static void main(String[] args) {
		int num1 = 10,num2 = 5;
		int result;//��Ž��
		//�ӷ�
		result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		
		//�ַ������ӣ�������������ִ�У�
		System.out.println(num1+num2);//��ֵ��������
		System.out.println(""+num1+num2);//�ַ�������
		
		//����
		result = num1 -num2;
		System.out.println(num1+"-"+num2+"="+result);
		
		//����
		result = 13 / 5; //������ӷ�ĸ��Ϊ����ʱ�����Ϊȡ����ֵ
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
