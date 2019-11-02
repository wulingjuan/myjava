package com.hello.method;
/**
    * 关于可变参数列表和重载的问题
 * @author admin
 * @version 1.0.0
 */

public class ArgsDemo3 {
	
	public int getSum(int a,int b) {
		System.out.println("不带可变参数列表的方法被调用");
		return a+b;
	}
	public int getSum(int...a) {
		int sum=0;
		for (int i : a) {
			sum+=i;
		}
		System.out.println("带可变参数的方法被调用！");
		return sum;
	}
	public static void main(String[] args) {
		ArgsDemo3 ad3 = new ArgsDemo3();
		System.out.println("和为："+ad3.getSum(1,2));
	}

}
