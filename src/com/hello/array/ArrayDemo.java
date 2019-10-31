package com.hello.array;

public class ArrayDemo {

	public static void main(String[] args) {
		//声明一个整型数组
		int[] intArray;
		//声明一个字符串类型的数组
		String[] strArray;
		
		//只有创建才能分配内存空间
		intArray = new int[5];
		strArray = new String[10];
		
		//声明数组的同时进行创建
		float[] floatArray=new float[4];
		System.out.println("intArray的第二个元素为："+intArray[1]);
		System.out.println("strArray的第二个元素为："+strArray[1]);
		System.out.println("floatArray的第二个元素为：+"+floatArray[1]);
		
		//初始化数组
		char[] ch= {'a','b','c','d'};
		System.out.println("ch数组的长度为："+ch.length);
		//循环为整型数组赋值
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i+1;
			System.out.println(intArray[i]);
		}
	}

}
