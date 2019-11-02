package com.hello.method;

public class ArrayMethod {
	//打印输出数组元素的值
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) { 
		int[] arr=new int[3];
//		arr = {2,3,4}; 没有这种赋值方法，只能通过
		arr[0]=2;
		arr[1]=3;
		arr[2]=4;
//		或者通过直接定义的方法
//		int[] arr= {1,2,3};
		ArrayMethod.printArray(arr);
	}

}
