package com.hello.example;

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

	private int[] arr = new int[10];

	public int[] insertData() {
		int[] arr = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length - 1; i++) {
			// �ٽ���һ�����ݣ����������в���������׼��
			System.out.println("�����������еĵ�" + (i + 1) + "��Ԫ�أ�");
			try {
				arr[i] = scanner.nextInt();				
			} catch (Exception e) {
				System.out.println("��������ݸ�ʽ���󣬲����з�����");
				scanner.next();//���������ݽ��н���
				i--;//���������һ������
			}
		}
		scanner.close();
		return arr;
	}

	// ��ʾ��������
	public void showData(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// ��ָ��λ�ô���������
	// ��ѯ�ܱ�3����������
	// �˳�
	public static void main(String[] args) {
		System.out.println("1--��������");
		System.out.println("2--��ʾ��������");
		System.out.println("3--��ָ��λ�ô���������");
		System.out.println("4--��ѯ�ܱ�3����������");
		System.out.println("0--�˳�");
		System.out.println("�������Ӧ�����ֽ��в�����");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		// �������
		DataManage dManage = new DataManage();
		switch (n) {
		case 0:
			break;
		case 1:
			dManage.arr = dManage.insertData();
			System.out.println("�������Ӧ�����ֽ��в�����");
			break;
		case 2:
			dManage.showData(dManage.arr);
			System.out.println("�������Ӧ�����ֽ��в�����");
			break;
		case 3:
			System.out.println("�������Ӧ�����ֽ��в�����");
			break;
		case 4:
			System.out.println("�������Ӧ�����ֽ��в�����");
			break;
		default:
			break;
		}

	}

}
