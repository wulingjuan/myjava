package com.hello.operator;

public class MathDemo1 {

	public static void main(String[] args) {
		//x++	�Ȳ�������һ�����������ٽ�������
		int x=4;
		int y=(x++)+5;
		System.out.println("x="+x+",y="+y);
		
		//++x����ʽ 	�Ƚ��������ٽ��в�������һ����������
		x = 4;
		y=(++x)+5;
		System.out.println("x="+x+",y="+y);
		
		//x-- �Ȳ����������һ�����������ٽ����Լ�
		x = 4;
		y = (x--)+5;
		System.out.println("x="+x+",y="+y);
		
		//--x �Ƚ���
		x=4;
		y =(--x)+5;
		System.out.println("x="+x+",y="+y);
	}

}
