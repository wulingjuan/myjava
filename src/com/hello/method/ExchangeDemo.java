package com.hello.method;

public class ExchangeDemo {
	//交换方法
	public void swap(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("交换前a="+a+" b="+b);
		System.out.println("交换后a="+a+" b="+b);
	}
	
	public void swapTest() {
		int m=4,n=5;
		System.out.println("交换前m="+m+" n="+n);
		swap(m, n);
		System.out.println("交换后m="+m+" n="+n);
	}
	
	private void ExchangeVar(int num) {
		num++;
		System.out.println("方法中num="+num);
	}
	
	public static void main(String[] args) {
		ExchangeDemo demo = new ExchangeDemo();
		demo.swapTest();
		
		int num=10;
		demo.ExchangeVar(num);
		System.out.println("主方法中num的值："+num);
	}
	
	//m,n的值并没有进行改变，因为m,n只是将内存中的值传递给了a,b
	//num同理

}
