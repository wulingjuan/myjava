package com.hello.method;

public class MethodDemo {
	//无参无返回值
	//打印输出星号的方法
	public static void printStar() {
		System.out.println("****************");
	}
	
	public static void main(String[] args) {
		//主方法中调用方法，非静态方法用对象名调用
		//静态方法使用类名调用
		//MethodDemo methodDemo = new MethodDemo();
		//methodDemo.printStar(); 
		
		MethodDemo.printStar();
		System.out.println("欢迎来到java的世界！");
		MethodDemo.printStar();
	}
	
}
