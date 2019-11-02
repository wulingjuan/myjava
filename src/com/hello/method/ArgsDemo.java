package com.hello.method;

public class ArgsDemo {
	// int...n可变参数列表
	//求和
	public void getSum(int... n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		System.out.println("sum="+sum);
	}

	public static void main(String[] args) {
		//
		ArgsDemo ad = new ArgsDemo();
		ad.getSum(1);
		ad.getSum(1,2);
		ad.getSum(1,2,3);
	}

}
