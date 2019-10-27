package com.hello.world;

public class StringDemo {
	public static void main(String[] args) {
		//定义一个空字符串
		String s1 = "";
		//定义一个字符串，内容是hello
		String s2 = "Hello";
//		定义一个包含unicode编码的字符串
		String s3 = "A\u005d\u005fB";
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		
//		定义一个包含空格的字符串
		String s4 = "Hello world";
		System.out.println("s4="+s4);
	}
}
