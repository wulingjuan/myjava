package com.hello.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//定义整型数组
		int[] intArr = new int[5];
		Scanner scanner = new Scanner(System.in);
		//从键盘接收数据，为数组元素赋值
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("请输入第"+(i+1)+"个元素");
			intArr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println();
		
		System.out.println("使用增强型for循环输出数组元素：");
		
		for(int n:intArr) System.out.println(n+" ");
		//求数组元素累加和
		int sum=0;
		for (int j = 0; j < intArr.length; j++) {
			sum+=intArr[j];
		}
		System.out.println("数组元素的累加和为："+sum);
	}

}
