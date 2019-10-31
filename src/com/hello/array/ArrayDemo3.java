package com.hello.array;

public class ArrayDemo3 {
	public static void main(String[] args) {
		//二维数组的声明
		//三种类型
		//声明int类型的二维数组
//		int[][] intArray;
//		float floatArray[][];
//		double[] doubleArray[];
		
		//创建一个三行三列的int类型的数组
//		intArray = new int[3][3];
		System.out.println();
		//声明数组的同时进行创建
//		char[][] ch =new char[3][5];
		//创建float类型的数组时，只指定行数
		float[][] f = new float[3][];
		//每行相当于一个一维数组，需要创建
		f[0] = new float[2];
		f[1] = new float[6];
		f[2] = new float[4];
		//只给定下标，数组索引下标越界，先有行，再有列
		//String[][] strings = new String[][3];
		
		
	}
}
