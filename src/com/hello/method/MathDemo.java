package com.hello.method;

public class MathDemo {
	
	//求两个int类型数的和
	public int getSum(int m,int n) {
		return m+n;
	}
	//求两个double类型数的和
	public double getSum(double m,double n) {
		return m+n;
	}
	//求数组元素的和
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
		System.out.println("两个int类型的和为："+demo.getSum(m,n));
		System.out.println("两个double类型的和为："+demo.getSum(a,b));
		System.out.println("数组元素的和为："+demo.getSum(arr));
		
	}

}
