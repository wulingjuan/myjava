package com.hello.flow;

import java.util.Scanner;

public class ScoreAssess {

	public static void main(String[] args) {
		/*
		 * 
		成绩大于等于90分，输出“优”
		成绩大于等于80分且小于90分，输出“良”
		成绩大于等于60分小于80分，输出“中”
		成绩小于60分，输出“不及格”
		*/
		
		System.out.println("输入一个学生成绩：");
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();
		scanner.close();
		if(score>=90) {
			System.out.println("优");
		}else if(score>=80 && score<90) {
			System.out.println("良");
		}else if(score>=60 && score<80) {
			System.out.println("中");
		}else {
			System.out.println("不及格");
		}
	}

}
