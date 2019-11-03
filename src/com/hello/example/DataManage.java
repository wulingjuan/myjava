package com.hello.example;

import java.util.InputMismatchException;
/**
 * �Ӽ��̽����������ݴ�ŵ������У����������е����ݽ��й���
 * @author shirley
 * 
 */
import java.util.Scanner;

//����һ���࣬�������е����ݽ��й���
public class DataManage {
	/**
	 * �������ݵ�����
	 * 
	 * @return
	 */
	public int[] insertData() {
		int[] arr = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length-1; i++) {
			// �ٽ���һ�����ݣ����������в���������׼��
			System.out.println("�����������еĵ�" + (i + 1) + "��Ԫ�أ�");
			try {
				arr[i] = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("��������ݸ�ʽ���󣬲����з�����");
				scanner.next();// ���������ݽ��н���
				i--;// ���������һ������
			}
		}
		return arr;
	}

	/**
	 * ��ʾ������Ԫ�ص�����
	 * 
	 * @param arr������
	 * @param length��Ҫ��ʾ����Ԫ���еĸ���
	 */
	public void showData(int[] arr, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * �Ӽ��̽���һ�����ݣ����뵽�����ָ��λ�ô�
	 * 
	 * @param arr��Ҫ�������������
	 * @param n��Ҫ���������
	 * @param k��Ҫ�����λ�ã���0��ʼ
	 */
	public void insertArray(int[] arr, int n, int k) {
		// ע������һ�����ݿ�ʼ�ƶ����������ݸ���
		// ���ɾ��һ�������ǴӺ���ǰ�ƶ�
		for (int i = arr.length - 1; i > k; i--) {
			arr[i] = arr[i - 1];
		}
		arr[k] = n;
	}
	
	/**
	 * ������������ܱ�3������Ԫ�ظ���
	 * @param a������
	 */
	private void divThree(int[] a) {
		int count=0;
		for (int n : a) {
			if(n%3 ==0) count++;
		}
		if(count ==0) System.out.println("������û���ܱ�3��������");
		else System.out.println("�������ܱ�3��������Ϊ��"+count);
	}
	/**
	 * ��ʾ��Ϣ
	 */
	private void notice() {
		System.out.println("*************************");
		System.out.println("   1--��������");
		System.out.println("   2--��ʾ��������");
		System.out.println("   3--��ָ��λ�ô���������");
		System.out.println("   4--��ѯ�ܱ�3����������");
		System.out.println("   0--�˳�");
		System.out.println("*************************");
	}
	
	public static void main(String[] args) {

		DataManage dManage = new DataManage();
		Scanner scanner = new Scanner(System.in);
		int input;
		int[] a=null;
		if(a==null) {
			System.out.println(111111);
		}
		//ѭ����������switch
		while (true) {
			dManage.notice();
			System.out.println("�������Ӧ�����ֽ��в�����");
			input=0;
			try {
				input=scanner.nextInt();				
			} catch (InputMismatchException e) {
				System.out.println("��������ݸ�ʽ���󣬲����з�����");
				scanner.next();
				continue;
			}
			if (input==0) {
				break;
			}
			switch (input) {
			case 1:
				System.out.println("��������");
				a=dManage.insertData();
				break;
			case 2:
				System.out.println("��ʾ����");		
				if(a!=null) {
					//˵��û�в������һ���������Բ�չʾ���һ������
					if(a[a.length-1]==0) dManage.showData(a, a.length-1);;
				}else {
					System.out.println("��δ�������в������ݣ�������ѡ�������");
					break;
				}
				dManage.showData(a, a.length-1);
				break;
			case 3:
				if(a!=null) {
					try {
						System.out.println("��ָ��λ�ò�������");
						System.out.println("������Ҫ��������ݣ�");
						int m=scanner.nextInt();
						System.out.println("������Ҫ�������ݵ�λ�ã�");
						int n=scanner.nextInt();
						dManage.insertArray(a, m, n);
					}catch (InputMismatchException e) {
						System.out.println("��������ݸ�ʽ���󣬲����з�����");
						scanner.next();
						continue;
					}
				}else System.out.println("��δ�������в������ݣ�������ѡ�������");
				break;
			case 4:
				if (a!=null) {
					System.out.println("��ѯ�ܱ�3���������ݸ���");
					dManage.divThree(a);
				}else System.out.println("��δ�������в������ݣ�������ѡ�������");
				break;
			}
		}
	}

}
