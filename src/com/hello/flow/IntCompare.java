package com.hello.flow;

public class IntCompare {

	public static void main(String[] args) {
		//�����������ͱ���
		int x=15,y=10;
		//�ж�x��y�Ƿ����
		if(x!=y) {
			if(x>y) {
				System.out.println(x+"����"+y);
			}else {
				System.out.println(x+"С��"+y);
			}
		}else {
			System.out.println(x+"����"+y);
		}
	
		char c='8';
		System.out.println(c+1);
		
		char ch='b';
		//ʹ��switch�ṹ�ж��Ƿ�ΪԪ����ĸ���������Ӧ����Ϣ
		switch (ch){
		    case 'a': 
		        System.out.println("Ԫ����ĸa");
		        break;
		    case 'e': 
		        System.out.println("Ԫ����ĸe");
		        break;
		    case 'i': 
		        System.out.println("Ԫ����ĸi");
		        break;
		    case 'o': 
		        System.out.println("Ԫ����ĸo");
		        break;
		    case 'u': 
		        System.out.println("Ԫ����ĸu");
		        break;
		    default: 
		        System.out.println("��Ԫ����ĸ");
		        break;
		}
		
	}

}
