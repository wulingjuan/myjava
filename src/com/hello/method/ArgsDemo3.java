package com.hello.method;
/**
    * ���ڿɱ�����б�����ص�����
 * @author admin
 * @version 1.0.0
 */

public class ArgsDemo3 {
	
	public int getSum(int a,int b) {
		System.out.println("�����ɱ�����б�ķ���������");
		return a+b;
	}
	public int getSum(int...a) {
		int sum=0;
		for (int i : a) {
			sum+=i;
		}
		System.out.println("���ɱ�����ķ��������ã�");
		return sum;
	}
	public static void main(String[] args) {
		ArgsDemo3 ad3 = new ArgsDemo3();
		System.out.println("��Ϊ��"+ad3.getSum(1,2));
	}

}
