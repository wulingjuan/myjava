package com.hello.flow;

public class ForDemo {
	public static void main(String[] args) {
	//      ��forѭ��������1-5���ۼӺ�
	//		ִ�й���
	//		��һ�� int i=0;
	//		�ڶ��� i<6;
	//		������ {ִ�����};
	//		���Ĳ�{i++};
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("1��5��ֵΪ��" + sum);
		
	//		forѭ������ʡ��
		int j=1;
		for (;;) {
			System.out.println(j);
			j++;
			if(j>10) break;
		}
	}
}
