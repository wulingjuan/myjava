package com.hello.method;

public class ExchangeDemo {
	//��������
	public void swap(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("����ǰa="+a+" b="+b);
		System.out.println("������a="+a+" b="+b);
	}
	
	public void swapTest() {
		int m=4,n=5;
		System.out.println("����ǰm="+m+" n="+n);
		swap(m, n);
		System.out.println("������m="+m+" n="+n);
	}
	
	private void ExchangeVar(int num) {
		num++;
		System.out.println("������num="+num);
	}
	
	public static void main(String[] args) {
		ExchangeDemo demo = new ExchangeDemo();
		demo.swapTest();
		
		int num=10;
		demo.ExchangeVar(num);
		System.out.println("��������num��ֵ��"+num);
	}
	
	//m,n��ֵ��û�н��иı䣬��Ϊm,nֻ�ǽ��ڴ��е�ֵ���ݸ���a,b
	//numͬ��

}
