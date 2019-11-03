package com.hello.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaseGrammer {
	/**
	 * 初始化数学成绩
	 * 
	 * @return 数学成绩数组
	 */
	public float[] initScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要存储的数学成绩的数量：");
		int num=0;
		try {
			num = scanner.nextInt();			
		} catch (InputMismatchException e) {
			System.out.println("输入的数据格式有误，不能有非数字！");
			scanner.next();
		}
		float[] arr = new float[num];
		for (int i = 0; i < num; i++) {
			System.out.println("请输入第" + (i + 1) + "个数据：");
			try {
				arr[i] = scanner.nextFloat();				
			} catch (InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字！");
				scanner.next();
				i--;
			}
		}
		return arr;
	}
	
	/**
	 * 求平均成绩的方法
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
	 * 统计成绩大于85分的人数
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
	 * 修改指定位置处成绩的方法
	 * @param arr
	 * @param index
	 * @param newScore
	 */
	public void update(float[] arr,int index,float newScore) {
		arr[index]=newScore;
	}
	
	/**
	 * 打印输出所有成绩
	 * @param arr
	 */
	public void displayAllScore(float[] arr) {
		System.out.println("成绩为：");
		for (float f : arr) {			
			System.out.print(f+" ");
		}
		System.out.println();
	}
	/**
	 * 显示菜单
	 */
	public void displayMenu() {
		System.out.println("***************************");
		System.out.println("    1--初始化数学成绩");
		System.out.println("    2--求成绩的平均值");
		System.out.println("    3--统计成绩大于85分的人数");
		System.out.println("    4--修改指定位置处的成绩");
		System.out.println("    5--打印输出所有成绩");
		System.out.println("    0--退出");
		System.out.println("***************************");
	}

	public static void main(String[] args) {
		BaseGrammer bGrammer = new BaseGrammer();

		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		float[] arr=null;
		
		while (true) {
			bGrammer.displayMenu();
			System.out.println("请输入对应的数字进行操作：");
			try {
				input = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("请输入正确的数据格式，不能为非数字");
				scanner.next();
				continue;
			}
			if (input == 0) {
				System.out.println("退出程序！");
				break;
			}
			switch (input) {
			case 1:
				arr=bGrammer.initScore();
				break;
			case 2:
				if(arr==null) {
					System.out.println("请先初始化数学成绩！");
					break;
				}
				float ave=bGrammer.average(arr);	
				System.out.println("数学平均成绩为："+ave);
				break;
			case 3:
				if(arr==null) {					
					System.out.println("请先初始化数学成绩！");
					break;
				}
				int count = bGrammer.count(arr);
				System.out.println("成绩大于85分的人数为："+count);
				break;
			case 4:
				if(arr==null) {
					System.out.println("请先初始化数学成绩！");
					break;
				}
				System.out.println("修改前：");
				bGrammer.displayAllScore(arr);
				System.out.println("请输入要修改数据的位置（从0开始）");
				int m=0;
				try {
					m= scanner.nextInt();					
				} catch (InputMismatchException e) {
					System.out.println("输入的数据格式不正确，不能为非数字！");
					scanner.next();
					break;
				}
				System.out.println("请输入新数据：");
				float n=0;
				try {
					n=scanner.nextFloat();
				} catch (InputMismatchException e) {
					System.out.println("输入的数据格式不正确，不能为非数字！");
					scanner.next();
					break;
				}
				System.out.println("修改后：");
				bGrammer.update(arr, m, n);
				bGrammer.displayAllScore(arr);
				break;
			case 5:
				if(arr==null) {
					System.out.println("请先初始化数学成绩！");
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
