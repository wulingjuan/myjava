package com.hello.method;

public class ArgsDemo1 {

	// ����
	public void search(int n,int...a) {
		boolean flag=false;
		for (int i : a) {
			if(n == i) {flag = true;break;};
		}
		if(flag) System.out.println("�ҵ���"+n);
		else System.out.println("û���ҵ�"+n);
	}

	public static void main(String[] args) {
		ArgsDemo1 ad1 = new ArgsDemo1();
		ad1.search(3, 1,2,3);
		int[] a= {1,2,3};
		ad1.search(1, a);
	}

}
