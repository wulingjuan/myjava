package com.hello.array;

public class ArrayDemo {

	public static void main(String[] args) {
		//����һ����������
		int[] intArray;
		//����һ���ַ������͵�����
		String[] strArray;
		
		//ֻ�д������ܷ����ڴ�ռ�
		intArray = new int[5];
		strArray = new String[10];
		
		//���������ͬʱ���д���
		float[] floatArray=new float[4];
		System.out.println("intArray�ĵڶ���Ԫ��Ϊ��"+intArray[1]);
		System.out.println("strArray�ĵڶ���Ԫ��Ϊ��"+strArray[1]);
		System.out.println("floatArray�ĵڶ���Ԫ��Ϊ��+"+floatArray[1]);
		
		//��ʼ������
		char[] ch= {'a','b','c','d'};
		System.out.println("ch����ĳ���Ϊ��"+ch.length);
		//ѭ��Ϊ�������鸳ֵ
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i+1;
			System.out.println(intArray[i]);
		}
	}

}
