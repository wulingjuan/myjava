package com.hello.flow;

public class JieChengPlus {
	public static void main(String[] args) {
		// ��1!+2!+3!+4!+...20!
		long sum = 0;
		int n = 1;
		for (int i = 1; i <= 20; i++) {
			n=1;  //����Ҫ��һ������Ȼ�����ڲ�ѭ��֮���ٽ��в���
			for (int j = 1; j <= i; j++) {
				n *= j;
			}
			sum += n;
		}
		System.out.println(sum);//���ֵ̫���ˣ������ʾ���������������͵ı�ʾ��Χ
	}
}
