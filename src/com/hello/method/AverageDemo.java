package com.hello.method;

public class AverageDemo {
	// �����ƽ��ֵ
	public float getAverage(float[] arr) {
		float sum=0,ave=0;
		for (float f : arr) {
			sum+=f;
		}
		ave = sum/arr.length;
		return ave;
	}
	
	//��������Ԫ�ص�ֵ
	public boolean search(int i,int[] arr) {
		for (int j : arr) {
			if(i == j) {
				System.out.println("���������ҵ���"+i);
				return true;
			}
		}
		System.out.println("��������û���ҵ�"+i);
		return false;
	}
	
	public static void main(String[] args) {
		AverageDemo demo = new AverageDemo();
		float[] arr= {78.5f,98.5f,65.5f,32.5f,75.5f};
		System.out.println("�����ƽ��ֵΪ��"+demo.getAverage(arr));
		
		int[] arr1 ={1,2,3};
		int num=1;
		demo.search(num, arr1);
	}

}
