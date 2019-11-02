package com.hello.method;

public class AverageDemo {
	// 数组的平均值
	public float getAverage(float[] arr) {
		float sum=0,ave=0;
		for (float f : arr) {
			sum+=f;
		}
		ave = sum/arr.length;
		return ave;
	}
	
	//查找数组元素的值
	public boolean search(int i,int[] arr) {
		for (int j : arr) {
			if(i == j) {
				System.out.println("在数组中找到了"+i);
				return true;
			}
		}
		System.out.println("在数组中没有找到"+i);
		return false;
	}
	
	public static void main(String[] args) {
		AverageDemo demo = new AverageDemo();
		float[] arr= {78.5f,98.5f,65.5f,32.5f,75.5f};
		System.out.println("数组的平均值为："+demo.getAverage(arr));
		
		int[] arr1 ={1,2,3};
		int num=1;
		demo.search(num, arr1);
	}

}
