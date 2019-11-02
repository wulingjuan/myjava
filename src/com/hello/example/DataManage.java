package com.hello.example;

/**
 * 从键盘接收整型数据存放到数组中，并对数组中的数据进行管理
 * @author shirley
 * 
 */
import java.util.Scanner;

//定义一个类，对数组中的数据进行管理
public class DataManage {
	/**
	 * 接收数据的数据
	 * 
	 * @return
	 */

	private int[] arr = new int[10];

	public int[] insertData() {
		int[] arr = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length - 1; i++) {
			// 少接收一个数据，方便后面进行插入数据做准备
			System.out.println("请输入数组中的第" + (i + 1) + "个元素：");
			try {
				arr[i] = scanner.nextInt();				
			} catch (Exception e) {
				System.out.println("输入的数据格式有误，不能有非数字");
				scanner.next();//将错误数据进行接收
				i--;//重新输入第一个数据
			}
		}
		scanner.close();
		return arr;
	}

	// 显示所有数据
	public void showData(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// 在指定位置处插入数据
	// 查询能被3整除的数据
	// 退出
	public static void main(String[] args) {
		System.out.println("1--插入数据");
		System.out.println("2--显示所有数据");
		System.out.println("3--在指定位置处插入数据");
		System.out.println("4--查询能被3整除的数据");
		System.out.println("0--退出");
		System.out.println("请输入对应的数字进行操作：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		// 定义对象
		DataManage dManage = new DataManage();
		switch (n) {
		case 0:
			break;
		case 1:
			dManage.arr = dManage.insertData();
			System.out.println("请输入对应的数字进行操作：");
			break;
		case 2:
			dManage.showData(dManage.arr);
			System.out.println("请输入对应的数字进行操作：");
			break;
		case 3:
			System.out.println("请输入对应的数字进行操作：");
			break;
		case 4:
			System.out.println("请输入对应的数字进行操作：");
			break;
		default:
			break;
		}

	}

}
