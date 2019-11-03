package com.hello.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaseGrammer {
	/**
	 * ��ʼ����ѧ�ɼ�
	 * 
	 * @return ��ѧ�ɼ�����
	 */
	public float[] initScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ�洢����ѧ�ɼ���������");
		int num=0;
		try {
			num = scanner.nextInt();			
		} catch (InputMismatchException e) {
			System.out.println("��������ݸ�ʽ���󣬲����з����֣�");
			scanner.next();
		}
		float[] arr = new float[num];
		for (int i = 0; i < num; i++) {
			System.out.println("�������" + (i + 1) + "�����ݣ�");
			try {
				arr[i] = scanner.nextFloat();				
			} catch (InputMismatchException e) {
				System.out.println("��������ݸ�ʽ���󣬲����з����֣�");
				scanner.next();
				i--;
			}
		}
		return arr;
	}
	
	/**
	 * ��ƽ���ɼ��ķ���
	 * @param arr
	 * @return
	 */
	public float average(float[] arr) {
		float sum=0;
		for (float f : arr) {
			sum+=f;
		}
		float ave=sum/arr.length;
		return ave;
	}
	
	/**
	 * ͳ�Ƴɼ�����85�ֵ�����
	 * @param arr
	 * @return
	 */
	public int count(float[] arr) {
		int count=0;
		for (float f : arr) {
			if (f>85) count++; 
		}
		return count;
	}
	
	/**
	 * �޸�ָ��λ�ô��ɼ��ķ���
	 * @param arr
	 * @param index
	 * @param newScore
	 */
	public void update(float[] arr,int index,float newScore) {
		arr[index]=newScore;
	}
	
	/**
	 * ��ӡ������гɼ�
	 * @param arr
	 */
	public void displayAllScore(float[] arr) {
		System.out.println("�ɼ�Ϊ��");
		for (float f : arr) {			
			System.out.print(f+" ");
		}
		System.out.println();
	}
	/**
	 * ��ʾ�˵�
	 */
	public void displayMenu() {
		System.out.println("***************************");
		System.out.println("    1--��ʼ����ѧ�ɼ�");
		System.out.println("    2--��ɼ���ƽ��ֵ");
		System.out.println("    3--ͳ�Ƴɼ�����85�ֵ�����");
		System.out.println("    4--�޸�ָ��λ�ô��ĳɼ�");
		System.out.println("    5--��ӡ������гɼ�");
		System.out.println("    0--�˳�");
		System.out.println("***************************");
	}

	public static void main(String[] args) {
		BaseGrammer bGrammer = new BaseGrammer();

		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		float[] arr=null;
		
		while (true) {
			bGrammer.displayMenu();
			System.out.println("�������Ӧ�����ֽ��в�����");
			try {
				input = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("��������ȷ�����ݸ�ʽ������Ϊ������");
				scanner.next();
				continue;
			}
			if (input == 0) {
				System.out.println("�˳�����");
				break;
			}
			switch (input) {
			case 1:
				arr=bGrammer.initScore();
				break;
			case 2:
				if(arr==null) {
					System.out.println("���ȳ�ʼ����ѧ�ɼ���");
					break;
				}
				float ave=bGrammer.average(arr);	
				System.out.println("��ѧƽ���ɼ�Ϊ��"+ave);
				break;
			case 3:
				if(arr==null) {					
					System.out.println("���ȳ�ʼ����ѧ�ɼ���");
					break;
				}
				int count = bGrammer.count(arr);
				System.out.println("�ɼ�����85�ֵ�����Ϊ��"+count);
				break;
			case 4:
				if(arr==null) {
					System.out.println("���ȳ�ʼ����ѧ�ɼ���");
					break;
				}
				System.out.println("�޸�ǰ��");
				bGrammer.displayAllScore(arr);
				System.out.println("������Ҫ�޸����ݵ�λ�ã���0��ʼ��");
				int m=0;
				try {
					m= scanner.nextInt();					
				} catch (InputMismatchException e) {
					System.out.println("��������ݸ�ʽ����ȷ������Ϊ�����֣�");
					scanner.next();
					break;
				}
				System.out.println("�����������ݣ�");
				float n=0;
				try {
					n=scanner.nextFloat();
				} catch (InputMismatchException e) {
					System.out.println("��������ݸ�ʽ����ȷ������Ϊ�����֣�");
					scanner.next();
					break;
				}
				System.out.println("�޸ĺ�");
				bGrammer.update(arr, m, n);
				bGrammer.displayAllScore(arr);
				break;
			case 5:
				if(arr==null) {
					System.out.println("���ȳ�ʼ����ѧ�ɼ���");
					break;
				}
				bGrammer.displayAllScore(arr);
				break;
			default:
				break;
			}
		}
	}

}
