package com.hello.method;

public class MathDemo {
	
	//������int�������ĺ�
	public int getSum(int m,int n) {
		return m+n;
	}
	//������double�������ĺ�
	public double getSum(double m,double n) {
		return m+n;
	}
	//������Ԫ�صĺ�
	public int getSum(int[] arr) {
		int sum=0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int m=5,n=10;
		double a=1.2,b=2.5;
		int[] arr= {7,5,2};
		MathDemo demo = new MathDemo();
		System.out.println("����int���͵ĺ�Ϊ��"+demo.getSum(m,n));
		System.out.println("����double���͵ĺ�Ϊ��"+demo.getSum(a,b));
		System.out.println("����Ԫ�صĺ�Ϊ��"+demo.getSum(arr));
		
	}

}
