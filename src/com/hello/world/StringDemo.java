package com.hello.world;

public class StringDemo {
	public static void main(String[] args) {
		//����һ�����ַ���
		String s1 = "";
		//����һ���ַ�����������hello
		String s2 = "Hello";
//		����һ������unicode������ַ���
		String s3 = "A\u005d\u005fB";
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		
//		����һ�������ո���ַ���
		String s4 = "Hello world";
		System.out.println("s4="+s4);
	}
}
