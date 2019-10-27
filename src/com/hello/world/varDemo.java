package com.hello.world;

public class varDemo {
	public static void main(String[] args) {
		//定义两个整型变量x,y
		//int x = 0,y = 0;
		int x,y;
		x=5;y=7;
		System.out.println("x="+x);
		System.out.println("y="+y);
		//字符本身是整型，字符相加结果为数值型
		System.out.print(x+'\t'+y+'\n');
		System.out.print(x+"\t"+y+'\n');
		
		//换行
		System.out.print(x+","+y);
		
		//用科学计数法表示浮点型数据
		double d = 1.23E5; //1.23x10的五次方
		float f= 1.23e5f;  //1.23x10的5次方
		System.out.println("d="+d);
		System.out.println("f="+f);
		
		// 定义一个整型变量n，值为98
		int n = 98;
		System.out.println("n="+n);
        //定义一个char类型的变量ch，将变量n赋值给ch，然后输出ch的值
		
	    char ch = 98;
	    System.out.println("ch="+ch);
	   	//定义一个长整型变量var，值为190000000，并输出
	   	long var = 190000000;
	   	System.out.println("var="+var);
		
		//定义一个double类型的变量d，将变量var的值赋值给d
		
		double e = var;
		System.out.println("e="+e);
	}
}
