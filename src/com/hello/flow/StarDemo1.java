package com.hello.flow;

public class StarDemo1 {

	public static void main(String[] args) {
		// 十行十列的星星
		char star = '*';
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println("分割线====================分割线");
		int m=1;
		int n=1;
		while (m<=10) {
			n=1;
			while (n<=m) {
				System.out.print('*');
				n++;
			}
			System.out.println();
			m++;
		}
	}

}
