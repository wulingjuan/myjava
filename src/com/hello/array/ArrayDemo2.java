package com.hello.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// ����������ֵ
		int[] intArr = { 7, 5, 9, 22, 43 };
		int max = intArr[0];
		for (int i = 0; i < intArr.length; i++) {
			if(intArr[i] > max) {
				max = intArr[i];
			}
		}
		System.out.println("�����е����ֵΪ��"+max);
	}

}
