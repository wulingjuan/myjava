package com.hello.world;

public class varDemo {
	public static void main(String[] args) {
		//�����������ͱ���x,y
		//int x = 0,y = 0;
		int x,y;
		x=5;y=7;
		System.out.println("x="+x);
		System.out.println("y="+y);
		//�ַ����������ͣ��ַ���ӽ��Ϊ��ֵ��
		System.out.print(x+'\t'+y+'\n');
		System.out.print(x+"\t"+y+'\n');
		
		//����
		System.out.print(x+","+y);
		
		//�ÿ�ѧ��������ʾ����������
		double d = 1.23E5; //1.23x10����η�
		float f= 1.23e5f;  //1.23x10��5�η�
		System.out.println("d="+d);
		System.out.println("f="+f);
		
		// ����һ�����ͱ���n��ֵΪ98
		int n = 98;
		System.out.println("n="+n);
        //����һ��char���͵ı���ch��������n��ֵ��ch��Ȼ�����ch��ֵ
		
	    char ch = 98;
	    System.out.println("ch="+ch);
	   	//����һ�������ͱ���var��ֵΪ190000000�������
	   	long var = 190000000;
	   	System.out.println("var="+var);
		
		//����һ��double���͵ı���d��������var��ֵ��ֵ��d
		
		double e = var;
		System.out.println("e="+e);
	}
}
