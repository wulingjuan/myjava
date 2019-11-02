package com.hello.method;

public class ArrayDemo {

	public void updateArray(int[] arr) {
		arr[3] = 15;
		System.out.println("数组arr的元素为：");
		for (int i : arr) {
			System.out.println(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayDemo demo = new ArrayDemo();
		int[] arr= {1,2,3,4};
		System.out.println("方法调用前数组arr的元素为：");
		for (int i : arr) {
			System.out.println(i+" ");
		}
		System.out.println();
		demo.updateArray(arr);
		System.out.println("方法调用后数组arr的元素为：");
		for (int j : arr) {
			System.out.println(j+" ");
		}
	}

}
