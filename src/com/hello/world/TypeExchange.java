package com.hello.world;

public class TypeExchange {

	public static void main(String[] args) {
		// char���ͺ�int����֮���ת��
		char c= (char)65536;
		int n;
		n=c;//��ʽת��
		c = (char)n;
		
		//���ͺ͸����͵�����ת������
		int x=100;
		long y=x;
		x= (int)y;
		
		float f= 1000000000L;
		System.out.println("f="+f);
		
		/*�ѳ�����ת����һ�������ȸ�����
		����˫���ȸ����Ϳ��ܻ�������ݶ�ʧ*/
		float f1 = 10365659895989L;
		System.out.println("f1="+f1);
	}

}
