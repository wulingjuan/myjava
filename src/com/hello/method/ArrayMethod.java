package com.hello.method;

public class ArrayMethod {
	//��ӡ�������Ԫ�ص�ֵ
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) { 
		int[] arr=new int[3];
//		arr = {2,3,4}; û�����ָ�ֵ������ֻ��ͨ��
		arr[0]=2;
		arr[1]=3;
		arr[2]=4;
//		����ͨ��ֱ�Ӷ���ķ���
//		int[] arr= {1,2,3};
		ArrayMethod.printArray(arr);
	}

}
