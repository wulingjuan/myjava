package com.hello.flow;

public class ForDemo {
	public static void main(String[] args) {
	//      用for循环来计算1-5的累加和
	//		执行过程
	//		第一步 int i=0;
	//		第二步 i<6;
	//		第三步 {执行语句};
	//		第四步{i++};
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("1到5的值为：" + sum);
		
	//		for循环可以省略
		int j=1;
		for (;;) {
			System.out.println(j);
			j++;
			if(j>10) break;
		}
	}
}
