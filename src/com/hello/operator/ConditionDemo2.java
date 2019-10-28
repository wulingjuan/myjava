package com.hello.operator;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// 例：判断一个整数是奇数还是偶数，并将结果打印输出
		//int n=13;
		//从键盘接收数据
		System.out.println("请输入一个整数");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		
		if(n%2==0) {
			System.out.println(n+"为偶数!");
		}else {
			System.out.println(n+"为奇数!");
		}

	}

}
