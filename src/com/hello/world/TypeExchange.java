package com.hello.world;

public class TypeExchange {

	public static void main(String[] args) {
		// char类型和int类型之间的转换
		char c= (char)65536;
		int n;
		n=c;//隐式转换
		c = (char)n;
		
		//整型和浮点型的类型转换问题
		int x=100;
		long y=x;
		x= (int)y;
		
		float f= 1000000000L;
		System.out.println("f="+f);
		
		/*把长整型转换成一个单精度浮点型
		或者双精度浮点型可能会出现数据丢失*/
		float f1 = 10365659895989L;
		System.out.println("f1="+f1);
	}

}
