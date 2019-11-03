package com.hello.example;

import java.util.InputMismatchException;
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
	public int[] insertData() {
		int[] arr = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length-1; i++) {
			// 少接收一个数据，方便后面进行插入数据做准备
			System.out.println("请输入数组中的第" + (i + 1) + "个元素：");
			try {
				arr[i] = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字");
				scanner.next();// 将错误数据进行接收
				i--;// 重新输入第一个数据
			}
		}
		return arr;
	}

	/**
	 * 显示数组中元素的内容
	 * 
	 * @param arr：数组
	 * @param length：要显示数组元素中的个数
	 */
	public void showData(int[] arr, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 从键盘接收一个数据，插入到数组的指定位置处
	 * 
	 * @param arr：要插入数组的数据
	 * @param n：要插入的数据
	 * @param k：要插入的位置，从0开始
	 */
	public void insertArray(int[] arr, int n, int k) {
		// 注意从最后一个数据开始移动，避免数据覆盖
		// 如果删除一个数则是从后往前移动
		for (int i = arr.length - 1; i > k; i--) {
			arr[i] = arr[i - 1];
		}
		arr[k] = n;
	}
	
	/**
	 * 是输出数组中能被3整除的元素个数
	 * @param a：数组
	 */
	private void divThree(int[] a) {
		int count=0;
		for (int n : a) {
			if(n%3 ==0) count++;
		}
		if(count ==0) System.out.println("数组中没有能被3整除的数");
		else System.out.println("数组中能被3整除的数为："+count);
	}
	/**
	 * 提示信息
	 */
	private void notice() {
		System.out.println("*************************");
		System.out.println("   1--插入数据");
		System.out.println("   2--显示所有数据");
		System.out.println("   3--在指定位置处插入数据");
		System.out.println("   4--查询能被3整除的数据");
		System.out.println("   0--退出");
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
		//循环里面套入switch
		while (true) {
			dManage.notice();
			System.out.println("请输入对应的数字进行操作：");
			input=0;
			try {
				input=scanner.nextInt();				
			} catch (InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字");
				scanner.next();
				continue;
			}
			if (input==0) {
				break;
			}
			switch (input) {
			case 1:
				System.out.println("插入数据");
				a=dManage.insertData();
				break;
			case 2:
				System.out.println("显示数据");		
				if(a!=null) {
					//说明没有插入最后一个数据所以不展示最后一个数据
					if(a[a.length-1]==0) dManage.showData(a, a.length-1);;
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作！");
					break;
				}
				dManage.showData(a, a.length-1);
				break;
			case 3:
				if(a!=null) {
					try {
						System.out.println("在指定位置插入数据");
						System.out.println("请输入要插入的数据：");
						int m=scanner.nextInt();
						System.out.println("请输入要插入数据的位置：");
						int n=scanner.nextInt();
						dManage.insertArray(a, m, n);
					}catch (InputMismatchException e) {
						System.out.println("输入的数据格式有误，不能有非数字");
						scanner.next();
						continue;
					}
				}else System.out.println("还未在数组中插入数据，请重新选择操作！");
				break;
			case 4:
				if (a!=null) {
					System.out.println("查询能被3整数的数据个数");
					dManage.divThree(a);
				}else System.out.println("还未在数组中插入数据，请重新选择操作！");
				break;
			}
		}
	}

}
