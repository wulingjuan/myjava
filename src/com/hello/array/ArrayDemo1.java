package com.hello.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//������������
		int[] intArr = new int[5];
		Scanner scanner = new Scanner(System.in);
		//�Ӽ��̽������ݣ�Ϊ����Ԫ�ظ�ֵ
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("�������"+(i+1)+"��Ԫ��");
			intArr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println();
		
		System.out.println("ʹ����ǿ��forѭ���������Ԫ�أ�");
		
		for(int n:intArr) System.out.println(n+" ");
		//������Ԫ���ۼӺ�
		int sum=0;
		for (int j = 0; j < intArr.length; j++) {
			sum+=intArr[j];
		}
		System.out.println("����Ԫ�ص��ۼӺ�Ϊ��"+sum);
	}

}
