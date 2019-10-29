package com.hello.flow;

public class IntCompare {

	public static void main(String[] args) {
		//定义两个整型变量
		int x=15,y=10;
		//判断x和y是否相等
		if(x!=y) {
			if(x>y) {
				System.out.println(x+"大于"+y);
			}else {
				System.out.println(x+"小于"+y);
			}
		}else {
			System.out.println(x+"等于"+y);
		}
	
		char c='8';
		System.out.println(c+1);
		
		char ch='b';
		//使用switch结构判断是否为元音字母，并输出对应的信息
		switch (ch){
		    case 'a': 
		        System.out.println("元音字母a");
		        break;
		    case 'e': 
		        System.out.println("元音字母e");
		        break;
		    case 'i': 
		        System.out.println("元音字母i");
		        break;
		    case 'o': 
		        System.out.println("元音字母o");
		        break;
		    case 'u': 
		        System.out.println("元音字母u");
		        break;
		    default: 
		        System.out.println("不元音字母");
		        break;
		}
		
	}

}
